package oop.inheritance;

import oop.inheritance.p2.B;

public class Main {

    public static void main(String[] args) {
        B objB = new B(8);

        // System.out.println(objB.v1); Cannot access private variable
        // System.out.println(objB.v2); Cannot access protected variable

        System.out.println(objB.v3);
        System.out.println(objB.v4);
        System.out.println(objB.v5);
        System.out.println(objB.v6);
        objB.doSomething();
    }
}
