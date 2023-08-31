package JUC.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    public static void main(String[] args) {
        /**
         * 自定义线程池
         * 
         * 参数一:核心线程数量 不能小于0
           参数二:最大线程数  不能小于等于0，最大数量>=核心线程数量
           参数三:空闲线程最大存活时间 用TimeUnit指定
           参数四:时间单位  用TimeUnit指定
           参数五:任务队列  不能为null
           参数六:创建线程工厂  不能为null
           参数七:任务的拒绝策略  不能为null

           ThreadPoolExecutor.AbortPolicy   默认策略:丢弃任务并抛出RejectedExecutionException异常  提示线程已经满了
           ThreadPoolExecutor.DiscardPolicy  丢弃任务，但是不抛出异常这是不推荐的做法
           ThreadPoolExecutor.Discardoldestpolicy  抛弃队列中等待最久的任务然后把当前任务加入队列
           ThreadPoolExecutor.callerRunsPolicy  调用任务的Run()方法绕过线程池直接执行

           一般设置核心的线程数最大设置为 5

           秒杀 20

           工作流：
            执行任务，若还有空闲核心线程数，就回调用核心线程取执行任务，
            若无空闲的核心线程，则将任务加入工作队列中，
            若无空闲核心线程，工作队列也满，  若还有空闲最大线程数，则创建临时线程取执行，若无空闲最大线程数，则触发拒绝策略

         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            3, 
            6, 
            60 , 
            TimeUnit.SECONDS, 
            new ArrayBlockingQueue<>(3), 
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy()
            );

            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run(){
                    
                }
            });
    }
}
