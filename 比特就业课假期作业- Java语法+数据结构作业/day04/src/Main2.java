public class Main2 {
    public static void Happy(int n) {
        int sum = 0;
        int digit = 0;
        for (int i = 0; i < 20; i++) {
            while (n != 0) {
                digit = n%10;
                sum += digit*digit;
                n/=10;
            }
            System.out.print(sum + " ");
            n = sum;
            sum = 0;
        }
    }
    public static void main(String[] args) {

        Happy(2);
    }
}
