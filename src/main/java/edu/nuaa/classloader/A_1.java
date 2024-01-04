package edu.nuaa.classloader;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/3 19:50
 */
public class A_1 {
    static {
        System.out.println("A init");
    }
    public A_1() {
        System.out.println("A Instance");
    }

    public static void main(String[] args) {
//        A a = new B();
        B_1[] arr = new B_1[10];
    }

}

class B_1 extends A_1 {
    static {
        System.out.println("B init");
    }
    public B_1() {
        System.out.println("B Instance");
    }
    public static void main(String[] args) {
//        A a = new B();
        B_1[] arr = new B_1[10];
    }
}
class C_1 {
    public static void main(String[] args) {
        B_1[] arr = new B_1[10];
    }
}
