package Thread;
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread");
    }
}
public class Main1 {


    public static void main(String[] args) {
        MyThread t = new MyThread();t.start();
    }
}
