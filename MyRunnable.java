public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Something weird is happening!");
        }
    }
}
