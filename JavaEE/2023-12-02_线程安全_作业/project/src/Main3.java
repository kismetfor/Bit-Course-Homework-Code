import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main3 {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        Thread producer = new Thread(()->{
            int n = 1;
            while (true) {
                try {
                    queue.put(Integer.toString(n));
                    System.out.println("生产者放入"+n);
                    n++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread conductor = new Thread(()->{

            while (true) {
                try {
                    System.out.println("消费者拿走"+queue.take());
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        conductor.start();
    }
}
