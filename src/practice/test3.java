package practice;

public class test3 implements Runnable{
    int number =1;
    Object obj = new Object();
    @Override
    public void run(){
        while(true){
            synchronized(obj){
                if(number >=100) break;
                System.out.print(number+" ");
                number+=2;
            }
        }
    }
    public static void main(String[] args) {
        test3 tc =new test3();
        Thread t1= new Thread(tc);
        Thread t2 =new Thread(tc);
        t1.start();
        t2.start();
    }
}