package ThreadCreate;
public class MyThread  extends Thread{

    @Override
    public void run(){
        for(int i =0 ;i < 100;i++){
            System.out.println(getName()+" "+i);
        }
    }



    public static void main(String[] args) {
        MyThread t =new MyThread();
        MyThread t1 =new MyThread();

        t.setName("线程1");
        t1.setName("线程2");
        t.start();
        t1.start();
    }
    
}
 