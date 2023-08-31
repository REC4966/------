package JUC.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        /**
         * 定长线程池
         * 最大特点：可以控制线程最大的并发数
         */
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        //执行
        newFixedThreadPool.execute(new Runnable() {
            @Override
            public void run(){

            }
        });
    }
}
