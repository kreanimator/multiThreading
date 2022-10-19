public class MyThread extends Thread {
    public void run(){
        for ( long i =0; i < 10000; i++){
            System.out.println(i);
        }
        System.out.println("The work is done and " + this.getName());
    }
    public void run(String s) {
        System.out.println("String in run is " + s);
    }

}
