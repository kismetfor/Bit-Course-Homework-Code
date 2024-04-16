public class Main1 {
    public static void main(String[] args) {
        Thread tc = new Thread(()-> {
            System.out.print(Thread.currentThread().getName()+" ");
        }, "c");

        Thread tb = new Thread(()-> {
            try {
                tc.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(Thread.currentThread().getName()+" ");
        }, "b");

        Thread ta = new Thread(()-> {
            try {
                tb.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(Thread.currentThread().getName()+" ");
        }, "a");

        ta.start();
        tb.start();
        tc.start();
    }
}
