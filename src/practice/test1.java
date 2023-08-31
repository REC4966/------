package practice;

public class test1 extends Thread{
    private static int ticket =1000;
    private static Object obj = new Object();
    @Override 
    public void run(){
        while(true){
            synchronized(obj){
                if(ticket == 0) break;
                System.out.println(Thread.currentThread().getName()+"当前在卖第"+ticket+"张票");
                ticket--;
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        test1 t1 =new test1();
        test1 t2 =new test1();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t1.start();
        t2.start();
    }
}
