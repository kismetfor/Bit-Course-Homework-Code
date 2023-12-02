public class Main5 {
    public static int max2(int a, int b){
        return a>b? a:b;
    }
    public static int max3(int a, int b, int c){
        return max2(a, b)>c? max2(a, b):c;
    }
    public static void main(String[] args) {
        //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
        //
        //​      要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
        int a = max3(2, 6,20);
        System.out.println(a);
    }
}
