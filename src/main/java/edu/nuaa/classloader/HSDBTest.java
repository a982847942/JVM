package edu.nuaa.classloader;

import java.io.IOException;

/**
 * java -cp sa-jdi.jar sun.jvm.hotspot.HSDB
 * instanceKlass大小在 64 位系统的大小为 0x1b8
 * @author brain
 * @version 1.0
 * @date 2024/1/3 21:22
 */
public class HSDBTest {
    public static void main(String[] args) throws IOException {
        A obj = new B();
        System.in.read();
        System.out.println(obj);
    }
}
abstract class A {
    private void test(){
        System.out.println("private");
    }
    public void printMe() {
        System.out.println("I love vim");
    }
    public abstract void sayHello();
}

class B extends A {
    @Override
    public void sayHello() {
        System.out.println("hello, i am child B");
    }
}

