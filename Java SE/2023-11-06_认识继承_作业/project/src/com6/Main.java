package com6;

import java.util.Scanner;

class Base {
    private int x;
    private int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class Sub extends Base {
    private int z;

    public Sub(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
    public int claculate() {
        return super.getX()*super.getY()*this.getZ();
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            Sub sub = new Sub(x,y,z);
            System.out.println(sub.claculate());
        }
    }
}
