package JUC.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool  implements Runnable{
    @Override
    public void run() {
    for(int i = 0 ;i<100;i++){
        System.out.println(Thread.currentThread().getName()+"---"+i);
    }
    }
    public static void main(String[] args) {
        //线程池 无上限
        //ExecutorService pool1 = Executors.newCachedThreadPool();

        //线程池 有上限
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        // 提交任务
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());
        pool1.submit(new ThreadPool());

        //销毁线程池
        // pool1.shutdown();
    }

    
}
