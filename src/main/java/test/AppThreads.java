package test;

/**
 * Created by hixam on 12/10/16.
 */
public class AppThreads {
    public static void main(String[] args) throws InterruptedException {
        MainThreads threadClass = new MainThreads("thread class");
        Thread thread = new Thread(new RunnableThread(), "runnable class");
        threadClass.start();
        thread.start();
        threadClass.join();
        thread.join();
        System.out.println("Se acabó.");
    }
}