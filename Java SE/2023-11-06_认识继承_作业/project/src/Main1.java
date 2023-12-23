class A {

}
class B extends A{

}
class C extends B {

}

public class Main1 {
    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new B();
        A a2 = new C();
        //父类引用 子类对象
    }
}
