public class Main2_1 {
    public static void main(String[] args) {
        double sum = 0;
        int flag = 1;
        for (int i = 1; i < 101; i++) {
            sum += 1.0*flag/i;
            flag *= -1;
        }
        System.out.println(sum);
    }
}
