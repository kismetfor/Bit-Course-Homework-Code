public class Main5 {
    //递归求斐波那契数列的第 N 项
    //1 1 2 3 5 8
    public static void main(String[] args) {
        int n = fibonaci(6);
        System.out.println(n);
    }
    public static int fibonaci(int n){
        if (n < 3) {
            return 1;
        }
        return fibonaci(n-1) + fibonaci(n-2);
    }
}
