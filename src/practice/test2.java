package practice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test2 implements Runnable{
    private int gifts= 100;
    private  Lock lock =new ReentrantLock();
    @Override
    public void run(){
        while(true){
            lock.lock();
            try{
                if(gifts<10) break;
                System.out.println(Thread.currentThread().getName()+"当前赠送第"+gifts+"礼物");
                gifts--;
                System.out.println("剩余"+gifts+"礼物");
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                lock.unlock();
            }
        }
    }
    public static void main(String[] args) {
        test2 test =new test2();
        Thread t1 =new Thread(test);
        Thread t2 =new Thread(test);
        t1.setName("小明");
        t2.setName("小红");
        t1.start();
        t2.start();
    }
    
}
