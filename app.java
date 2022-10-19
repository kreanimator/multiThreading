public class app {
    public static void main(String[] args) {


        MyRunnable  myRunnable = new MyRunnable();
        MyThread [] myThreads = new MyThread[10];
        for (int i =0; i <10; i++){
            myThreads [i] = new MyThread();
        }
        for (Thread thread : myThreads)
        {
            thread.start();
        }

// Thread thread1 = new Thread(myRunnable);
//      Thread thread2 = new Thread(myRunnable);
//      Thread thread3 = new Thread(myRunnable);
//      thread1.setName("Thread1");
//      thread1.start();
//      thread2.setName("Thread2");
//      thread2.start();
//      thread3.setName("Thread3");
//      thread3.start();



    }
}
