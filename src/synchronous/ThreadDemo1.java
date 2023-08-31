package synchronous;

public class ThreadDemo1  extends Thread{
    private static int  ticket =0;
    private static Object obj =new Object();

    /**
     * 同步代码块 synchronized
     */
    @Override
    public void run(){
        while(true){
            synchronized(obj){
                if(ticket == 100) break;
                ticket++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("当前"+Thread.currentThread().getName()+"在卖第"+ticket+"票");
            }
        }
    }
    public static void main(String[] args) {
        ThreadDemo1 thread1 =new ThreadDemo1();
        ThreadDemo1 thread2 =new ThreadDemo1();
        ThreadDemo1 thread3 =new ThreadDemo1();
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
