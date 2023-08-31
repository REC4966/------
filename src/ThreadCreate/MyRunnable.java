package ThreadCreate;
public class MyRunnable implements Runnable {

    @Override
    public void run() {

        for(int i =0 ;i < 100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }


    public static void main(String[] args) {
        Thread t =new Thread(new MyRunnable());
        Thread t1 =new Thread(new MyRunnable());

        t.setName("线程1");
        t1.setName("线程2");
        t.start();
        t1.start();
    }
    
}
