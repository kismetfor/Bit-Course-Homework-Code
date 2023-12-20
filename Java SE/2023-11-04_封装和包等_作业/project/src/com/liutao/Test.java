package com.liutao;

class Test{
    public String toString() {
        System.out.print("aaa");
        return "bbb";
    }
}

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);
    }
