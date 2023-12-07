public class Main3 {
    public static void main(String[] args) {
        factor(1234);
    }
    public static int weishu(int n){
        int ret = 0;
        while (n != 0){
            n /= 10;
            ret++;
        }
        return ret;
    }
    public static void factor(int n){
        int m = weishu(n);
        if (m == 1){
            System.out.print(n+" ");
        }
        else {
            int digit = (int) (n / Math.pow(10, m-1));
            System.out.print(digit+" ");
            factor((int)(n-digit*Math.pow(10, m-1)));
        }
    }
}
