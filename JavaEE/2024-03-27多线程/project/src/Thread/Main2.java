package Thread;

 class  MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("thread");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread1());
        t.start();
    }
}
