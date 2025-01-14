package clgOOps;
//Thread example by extending thread class
public class Multi extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String[] args) throws InterruptedException {
        Multi t1 = new Multi();
        t1.start();
        Thread.sleep(300);
    }
}
