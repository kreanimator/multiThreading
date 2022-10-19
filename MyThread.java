public class MyThread extends Thread {
    public void run(){

            System.out.println("The work is done by " + this.getName());

        }
    public void run(String s) {
        System.out.println("String in run is " + s);
    }

}
