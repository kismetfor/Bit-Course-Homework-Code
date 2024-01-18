public class Main5 {
    //弗洛伊德循环查找算法
    public static boolean isHappy(int n) {
        int slow = n;
        int fast  = n;
        while (true) {
            slow = Next(slow);
            fast = Next(Next(fast));
            if (fast == 1) {
                return true;
            } else if (fast == slow) {
                return false;
            }
        }
    }
    public static int Next(int n){
        int sum = 0;
        while (n != 0){
            int digit = n % 10;
            sum += digit*digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(3));
    }
}
