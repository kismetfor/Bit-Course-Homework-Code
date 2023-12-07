public class Main4 {
    public static void main(String[] args) {
        int n = sum_of_digits(123);
        System.out.println(n);
    }
    public static int count_digits(int n){
        int ret = 1;
        while (n>10){
            ret++;
            n /= 10;
        }
        return ret;
    }
    public static int sum_of_digits(int n){
        int m = count_digits(n);
        if(n <= 9){
            return n;
        }
        else {
            int digit = n % 10;
            return digit + sum_of_digits(n/10);
        }
    }
}
