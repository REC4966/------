package ThreadCreate;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum =0;
        for(int i =1 ;i <=100;i++){
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask futureTask =new FutureTask<>(new MyCallable());
        Thread t =new Thread(futureTask);
        t.start();
        System.out.println(futureTask.get()); 
    }


}
