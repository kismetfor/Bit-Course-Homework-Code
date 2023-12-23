package com4;
class X{
    Y y = new Y(); //实例

    public X() {
        System.out.println("X");
    }
}
class Y {
    public Y() {
        System.out.println("Y");
    }
}
public class Z extends X{
    Y y = new Y();
    public Z() {
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
//父类的静态
//子类的静态
//父类的实例
//父类的构造
//子类的实例
//子类的构造