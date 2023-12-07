public class Main2 {
    public static void main(String[] args) {
        int n = factor(10);
        System.out.println(n);
    }
    public static int factor(int n){
        if (n == 1) {
            return n;
        }
        return n + factor(n-1);
    }
}
