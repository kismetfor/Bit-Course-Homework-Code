public class Main7 {
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
    public static int add(int a, int b){
        return a+b;
    }
     public static double add(double a, double b){
        return a+b;
    }
     public static double add(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1.2,2.3));
        System.out.println(add(1.2,2.3, 3.4));
    }
}
