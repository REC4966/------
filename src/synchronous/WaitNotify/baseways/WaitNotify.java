package synchronous.WaitNotify.baseways;

public class WaitNotify {
    public static void main(String[] args) {
        Consumer consumer =new Consumer();
        Producer producer =new Producer();
        consumer.start();
        producer.start();
    }
}
