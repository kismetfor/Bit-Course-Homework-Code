public class Main8 {
    public static int mmax(int a, int b){
        return a>b?a:b;
    }
    public static double mmax(double a, double b){
        return a>b?a:b;
    }
    public static double mmax(double a, double b, double c){
        return mmax(a, b)>c?mmax(a,b):c;
    }
    public static void main(String[] args) {
        //在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
        System.out.println(mmax(3,4));
        System.out.println(mmax(3.1, 5.3, 7.9));
    }
}
