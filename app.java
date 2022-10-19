public class app {
    public static void main(String[] args) {
        AccountDanger accountDanger = new AccountDanger();
        Thread one = new Thread(accountDanger);
        Thread two = new Thread(accountDanger);
        one.setName("Fred");
        two.setName("Lucy");
        one.start();
        two.start();
   


//        MyRunnable myRunnable = new MyRunnable();
//        MyThread[] myThreads = new MyThread[10];
//        for (int i = 0; i < 10; i++) {
//            myThreads[i] = new MyThread();
//
//            try{
//                Thread.sleep(1000);
//            }catch (InterruptedException ex){
//                ex.printStackTrace();
//            }
//
//        }
//        for (Thread thread : myThreads) {
//            thread.setName("Val's " + thread.getName() + thread.getState());
//            thread.start();
//            thread.setPriority(5);
//
//            System.out.println(thread.getState());
//
//        }

//        Thread thread1 = new Thread(myRunnable);
//        Thread thread2 = new Thread(myRunnable);
//        Thread thread3 = new Thread(myRunnable);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();



    }
}
