import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class MyBlockingQueue {
    private int size;
    private String[] elems;
    private int head;
    private int tail;

    public MyBlockingQueue(int capacity) {
        elems = new String[capacity];
    }

    public void put(String elem) throws InterruptedException {
        synchronized (elems) {
            while (size >= elems.length) {
                elems.wait();
            }
            elems[tail++] = elem;
            tail %= elems.length;
            size++;
            elems.notify();
        }
    }

    public String take() throws InterruptedException {
        String elem = null;
        synchronized (elems) {
            while (size <= 0) {
                elems.wait();
            }
            elem = elems[head++];
            head %= elems.length;
            size--;
            elems.notify();
        }
        return elem;
    }

}
public class Main2 {
    public static void main(String[] args) {
        MyBlockingQueue queue = new MyBlockingQueue(3);
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
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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
