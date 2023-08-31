package synchronous;

public class ThreadDemo3  extends Thread{
    private static int  ticket =0;

    /**
     * 同步方法 synchronized
     */
    @Override
    public void run(){
        while(true){
           if(method()) break;
        }
    }
    //当前锁对象是this
    //静态方法 是当前类的字节码对象
    private synchronized boolean method(){
         if(ticket == 100) return true;
         else{
            ticket++;
            try {
             Thread.sleep(100);
            } catch (InterruptedException e) {
            // TODO Auto-generated catch block
             e.printStackTrace();
            }
            System.out.println("当前"+Thread.currentThread().getName()+"在卖第"+ticket+"票");
         }
         return false;        
    }
    public static void main(String[] args) {
        ThreadDemo3 thread1 =new ThreadDemo3();
        ThreadDemo3 thread2 =new ThreadDemo3();
        ThreadDemo3 thread3 =new ThreadDemo3();
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
