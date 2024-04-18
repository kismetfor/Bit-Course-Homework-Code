class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
class SingletonLazy {
    static volatile Object  locker = new Object();
    private static SingletonLazy instance = null;
    private SingletonLazy(){}

    public static SingletonLazy getInstance() {
        if (instance==null) {
            synchronized (locker) {
                if (instance==null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
public class Main1 {
    public static void main(String[] args) {

    }
}
