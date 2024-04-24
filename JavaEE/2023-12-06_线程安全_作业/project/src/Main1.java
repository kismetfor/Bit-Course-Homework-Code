import java.util.Comparator;
import java.util.PriorityQueue;

class MyTimerTask implements Comparable<MyTimerTask> {
    private long time;
    private Runnable runnable;

    public MyTimerTask(Runnable runnable, long delay) {
        this.time = System.currentTimeMillis() + delay;
        this.runnable = runnable;
    }

    @Override
    public int compareTo(MyTimerTask o) {
        return (int)(this.time-o.time);
    }
    public void run(){
        runnable.run();}

    public long getTime() {
        return time;
    }
}
class MyTimer {
    private PriorityQueue<MyTimerTask> queue = new PriorityQueue<>();

    public void schedule(Runnable runnable, long delay) {
        MyTimerTask task = new MyTimerTask(runnable, delay);
        synchronized (queue) {
            queue.offer(task);
            queue.notify();
        }
    }

    public MyTimer() {
        new Thread(()->{
            synchronized (queue) {
                while (true) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    long curTime = System.currentTimeMillis();
                    MyTimerTask task = queue.peek();
                    if (curTime >= task.getTime()) {
                        task.run();
                        queue.poll();
                    } else {
                        try {
                            queue.wait(task.getTime()-curTime);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }).start();
    }
}
public class Main1 {
    public static void main(String[] args) {
        MyTimer timer = new MyTimer();
        timer.schedule(()->{
            System.out.println("1000");
        }, 1000);
    }
}
