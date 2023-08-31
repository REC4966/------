package synchronous;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemoLock  implements Runnable{
    private  int  ticket =0;
    private  Lock  lock =new ReentrantLock();

    /**
     * 同步代码块 Lock
     */
    @Override
    public void run(){
        while(true){  
            lock.lock();   
            try { 
            if(ticket == 100) break;
            ticket++;
            Thread.sleep(100);
            System.out.println("当前Lock"+Thread.currentThread().getName()+"在卖第"+ticket+"票");
             } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally{
                lock.unlock();
            }   
        }
    }
    public static void main(String[] args) {
        ThreadDemoLock td =new ThreadDemoLock();
        Thread thread1 =new Thread(td);
        Thread thread2 =new Thread(td);
        Thread thread3 =new Thread(td);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
