package synchronous.WaitNotify.Blockqueue;


import java.util.concurrent.ArrayBlockingQueue;

public class WaitNotify {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue =new ArrayBlockingQueue<>(4);
        Cook cook =new Cook(queue);
        Foodie foodie =new Foodie(queue);
        cook.start();
        foodie.start();

    }
}
