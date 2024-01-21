public class Main5 {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = a;
        doS(b);
        System.out.println(a.intValue());
        System.out.println(a == b);
    }
    public static void doS(Integer integer) {
        integer = new Integer(2);
    }
}
