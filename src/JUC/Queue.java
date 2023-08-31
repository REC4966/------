package JUC;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.SynchronousQueue;

public class Queue {
    public static void main(String[] args) {
        //非阻塞队列 (并发队列 ) Int的最大值
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        // 拿取队列头元素并删除
        String poll =concurrentLinkedQueue.poll();
        //添加元素 offer /add
        boolean offer = concurrentLinkedQueue.offer("ccc");
        //查看头元素不删
        String peek = concurrentLinkedQueue.peek();

        //阻塞队列  LinkedBlockingDeque 指定有界 就有界
        //   ArrayBlockingQueue
        ArrayBlockingQueue<String> arrayBlockingQueue = new  ArrayBlockingQueue<>(3);
        //加数据 add 队列满了抛出异常 /offer 队列满了返回false
        arrayBlockingQueue.add(peek);
        
        //取数据 poll /peek
        arrayBlockingQueue.poll();
       

        //SynchronousQueue:它是一个不存储任何元素的队列 相当于一个中转站 不存储只转发
        SynchronousQueue<Object> synchronousQueue = new SynchronousQueue<>();
    }
}
