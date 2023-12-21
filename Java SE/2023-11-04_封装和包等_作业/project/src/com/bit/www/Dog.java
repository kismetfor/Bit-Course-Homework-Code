package com.bit.www;

public class Dog {
    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void barks() {
        System.out.println(this.name+" wangwang!");
    }
    public static void StaticFun() {
        System.out.println("STATICFUN");
    }
    public void show() {
        System.out.println("狗命"+this.name+"颜色"+this.color+"年龄"+this.age);
    }
    /*public String toString() {
        return "狗命 "+this.name+"颜色 "+this.color+"年龄 "+this.age;
    }*/
    //@是注解, Override是重写方法
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
