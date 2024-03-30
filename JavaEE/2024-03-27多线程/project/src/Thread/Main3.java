package Thread;

public class Main3 {


    public static void main(String[] args) {
        Thread t= new Thread(()-> {
            System.out.println("aint");
        });
        t.start();
    }
}
