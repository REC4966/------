package synchronous.WaitNotify.baseways;

public class Producer extends Thread{
    @Override
    public void run(){
        while(true){
            synchronized(Desk.lock){
                if(Desk.count == 0 ) break;
                if(Desk.foodFlag == 1){
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }    
                }else{
                    System.out.println("厨师做了一碗面条");
                    Desk.foodFlag = 1;
                    Desk.lock.notifyAll();
                }
            }
        }
    }
}
