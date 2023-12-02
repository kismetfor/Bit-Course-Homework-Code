public class Main6 {
//    求斐波那契数列的第n项。(迭代实现)
    //1 1 2 3 5
    public static int fibonaci(int n){
        if(n<3){
            return 1;
        }
        return fibonaci(n-1) + fibonaci(n-2);
    }
    public static void main(String[] args) {
        int n = fibonaci(8);
        System.out.println(n);
    }
}
