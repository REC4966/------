package synchronous.WaitNotify.baseways;

public class Consumer extends Thread {
    
    @Override
    public void run(){
        while(true){
            synchronized(Desk.lock){
                if(Desk.count == 0 ) break;
                if(Desk.foodFlag == 0) {
                    try {
                        Desk.lock.wait();//让当前线程和锁绑定
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    Desk.count--;
                    System.out.println("还能吃"+Desk.count);
                    Desk.lock.notifyAll();
                    Desk.foodFlag = 0;
                }
            }
        }
    }
}
