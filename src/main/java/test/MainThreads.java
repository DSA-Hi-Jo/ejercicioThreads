package test;

/**
 * Created by hixam on 12/10/16.
 */
public class MainThreads extends Thread{
    long lastexecution =0;
    int cnt = 0;
    public MainThreads(String _name){
    super(_name);
    }

    @Override
    public void run(){
        for(int i=0; i< 10; i++)
        {
            long elapsed = (lastexecution == 0 ) ? 0 : System.currentTimeMillis() - lastexecution;
            lastexecution = System.currentTimeMillis();
            System.out.println(getName() +" elapsed =" + elapsed + "ms. [" + (++cnt) + "]");
            long sleep = (long) (Math.random() * 2000);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
