package JUC.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        /**
         * 使用的队列是：SynchronousQueue  不做缓存任务   没有核心线程 只有临时线程的
         * 60s后就将空闲线程回收了
         * 最大线程数：Int的最大值
         * 线程可在空闲60s内重复使用
         * 60s后回收的是那一批空闲线程
         */
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        newCachedThreadPool.execute(new Runnable() {
            @Override
            public void run(){

            }
        });
    }
}
