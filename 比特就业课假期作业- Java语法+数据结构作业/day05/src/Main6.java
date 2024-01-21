public class Main6 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {
        if (num==0) {return 0;}
        return num%9 == 0 ? 9 : num%9;
    }
    public static int addDigits2(int num) {
        return 1 + (num-1)%9;
    }
    public static int addDigits1(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num !=0) {
                int digit = num%10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
