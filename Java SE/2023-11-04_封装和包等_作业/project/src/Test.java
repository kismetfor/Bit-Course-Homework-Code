public class Test {
    public int aMethod(){
//        static int i = 0;
        int i = 0;
        //static不能作为局部变量
        i++;
        return i;
    }
    public static void main(String args[]){
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}