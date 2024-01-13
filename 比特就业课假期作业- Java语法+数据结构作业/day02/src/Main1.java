public class Main1 {
    public static void main(String[] args) {
        /*
        算术右移对于负数，
        高位会用符号位（最高位的值）填充，
        而逻辑右移则无视符号位，直接用0填充。
         */
        System.out.println(-13>>1);
        System.out.println(13>>1);
        System.out.println(-13>>>1);
        System.out.println(13>>>1);
    }
}
