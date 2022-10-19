public class AccountDanger implements Runnable {
    private Account account = new Account();

    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amt) {
        if (account.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName()
                    + " is going to withdraw");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            account.withdraw(amt);
            System.out.println(Thread.currentThread().getName()
                    + " completes the withdrawal. The balance is "
                    + account.getBalance());
        } else {
            System.out.println("Not enough in account for "
                    + Thread.currentThread().getName()
                    + " to withdraw " + account.getBalance());
        }

    }
}
