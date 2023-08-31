package synchronous.WaitNotify.Blockqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {
    ArrayBlockingQueue<String> queue;
    public Cook(ArrayBlockingQueue<String> queue){
        this.queue =queue;
    }
    @Override
    public void run(){
        while(true){
            try {
                queue.put("面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
