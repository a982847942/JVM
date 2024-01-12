package edu.nuaa.memoryleak;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/12 15:41
 */
public class SingletonCauseLeak {
    public static void main(String[] args) {
        /**
         * B是静态单例，持有A的引用造成生命周期变长
         */
        A a = new A();
    }
}

class A {
    public A() {
        B.getInstance().setA(this);
    }
}

//B类采用单例模式
class B{
    private A a;
    private static B instance = new B();

    public B(){}

    public static B getInstance() {
        return instance;
    }

    public void setA(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }
}

