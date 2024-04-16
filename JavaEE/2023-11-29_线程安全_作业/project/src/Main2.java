public class Main2 {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread ta = new Thread(()->{
            System.out.print(Thread.currentThread().getName()+" ");
        }, "A");

        Thread tb = new Thread(()->{
            try {
                ta.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(Thread.currentThread().getName()+" ");
        }, "B");

        Thread tc = new Thread(()->{
            try {
                tb.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(Thread.currentThread().getName()+" ");
        }, "C");

        for (int i = 0; i < 10; i++) {
            ta.start();
            tb.start();
            tc.start();
        }

    }
}
