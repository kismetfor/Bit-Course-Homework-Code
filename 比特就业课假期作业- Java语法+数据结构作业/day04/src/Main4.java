public class Main4 {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
        System.out.println(isHappy(7));
        System.out.println(isHappy(3));
    }
    public static boolean isHappy(int n) {
        int sum = 0;
        int n1 = n;
        int count = 0;
        for (int i = 0;  ; i++) {
            while (true) {
                int a = n%10;
                sum += a*a;
                n /= 10;
                if (n == 0){break;}
            }
            if (sum==4){
                count++;
            }
            if (sum==1){return true;}
            if (count==2){return false;}
            n = sum;
            sum=0;
        }

    }
}
