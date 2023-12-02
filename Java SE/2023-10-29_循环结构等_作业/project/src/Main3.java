public class Main3 {
    public static void main(String[] args) {
//        输出一个整数的每一位，如：123的每一位是3，2，1
        int n = 123;
       while (true){
           System.out.println(n%10);
           n /= 10;
           if(n == 0){
               break;
           }
       }
    }
}
