package edu.nuaa.classloader;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/3 21:22
 */
public class HSDB {
    public abstract class A {
        public void printMe() {
            System.out.println("I love vim");
        }
        public abstract void sayHello();
    }
    public class B extends A {
        @Override
        public void sayHello() {
            System.out.println("hello, i am child B");
        }
    }

    public class MyTest {
        public static void main(String[] args) throws IOException {
            A obj = new B();
            System.in.read();
            System.out.println(obj);
        }
    }
}
