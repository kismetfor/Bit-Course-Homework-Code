public class Main6 {

    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (true) {
            if (n%2 == 0) {
                n /= 2;
            } else if (n%3 == 0) {
                n /= 3;
            } else if (n%5 == 0) {
                n /= 5;
            } else return n==1;
        }
    }

    public static void main(String[] args) {
        System.out.println(isUgly(6));
        System.out.println(isUgly(1));
        System.out.println(isUgly(14));
    }
}
