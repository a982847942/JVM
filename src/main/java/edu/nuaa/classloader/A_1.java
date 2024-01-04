package edu.nuaa.classloader;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/3 19:50
 */
public class A {
    static {
        System.out.println("A init");
    }
    public A() {
        System.out.println("A Instance");
    }

    public static void main(String[] args) {
//        A a = new B();
        B[] arr = new B[10];
    }

}

class B extends A{
    static {
        System.out.println("B init");
    }
    public B() {
        System.out.println("B Instance");
    }
    public static void main(String[] args) {
//        A a = new B();
        B[] arr = new B[10];
    }
}
class C{
    public static void main(String[] args) {
        B[] arr = new B[10];
    }
}
