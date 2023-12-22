public class Test3{

    private float f=1.0f;

    int m=12;

    static int n=1;

    public static void main(String args[]){

        Test3 t=new Test3();
        System.out.println(t.n);
//        t.f = 3.0; 可以调用 但是赋值要加f
//        this.n; n是static变量 不是通过this访问的 不属于当前对象
        Test3.n = 2;
//        Test.m m是成员变量 不能通过类访问
    }

    /*
    A. t.f = 3.0：这是不正确的，因为 f 被声明为私有成员，无法在 main 函数外部直接访问。
    应该提供一个公共的访问方法（getter）来访问 f。

B. this.n：这是不正确的，因为在静态上下文中（main 方法是静态方法），无法使用 this 关键字，
而且 n 是静态变量，应该通过类名直接访问。

C. Test.m：Test.m m是成员变量 不能通过类访问

D. Test.n：这是正确的，因为 n 是静态变量，可以通过类名直接访问。
*/
}