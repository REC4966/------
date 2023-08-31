package JUC.ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) {
        /**
         * newScheduledThreadPool 定时线程池 支持定时任务执行
         * schedule  可设置延时执行
         * execute    不能设置定时任务
         * 
         * scheduleAtFixedRate 方法可设置  n秒中之后执行一次 ，之后每隔m秒周期执行一次
         * 大的前提是：我要使用线程池
         * 
         * quartz 专门用来完成定时任务
         */
       ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);

       newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
         @Override
        public void run(){

        }

       }, 1, 3, TimeUnit.SECONDS);

       newScheduledThreadPool.schedule(new Runnable() {
        @Override
        public void run(){

        }
       },3,TimeUnit.SECONDS);
    }
}
