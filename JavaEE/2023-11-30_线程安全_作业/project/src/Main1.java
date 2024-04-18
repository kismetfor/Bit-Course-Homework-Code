class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}

class SingletonLazy {
    private volatile static SingletonLazy instance = null;
    private static Object lock = new Object();
    public static SingletonLazy getInstance() {
        if (instance==null) {
            synchronized (lock) {
                if (instance==null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

    private static void setInstance() {
    }
}
public class Main1 {
    //懒汉模式
    //在类加载时就创建实例，即使不使用也会创建。
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println(SingletonLazy.getInstance());
        });
        Thread t2 = new Thread(()->{
            System.out.println(SingletonLazy.getInstance());
        });
        t1.start();
        t2.start();

    }
}
