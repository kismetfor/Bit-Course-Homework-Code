import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main2 {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue(2);
        Thread producer = new Thread(()->{
            int n = 0;
            while (true) {
                try {
                    queue.put(Integer.toString(n));
                    System.out.println("生产者生产"+n);
                    n++;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread conductor = new Thread(()->{
            while (true) {
                try {
                    System.out.println("消费者消费"+queue.take());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producer.start();
        conductor.start();
    }
}
