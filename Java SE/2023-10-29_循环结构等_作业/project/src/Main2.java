public class Main2 {
    public static void main(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值    。
        double sum = 0.0;
        double temp;
        for (int i = 1; i <= 100; i++) {
            temp = 1.0/i;
            if(i%2!=0){
                sum += temp;
            }
            else{
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
