package JUC.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {
    public static void main(String[] args) {
        //单线程 线程池
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.execute(new Runnable() {
          @Override
          public void run(){
            System.out.println(Thread.currentThread().getName());
          }  
        });
        //关闭线程池
        newSingleThreadExecutor.shutdown();
    }
    
}
