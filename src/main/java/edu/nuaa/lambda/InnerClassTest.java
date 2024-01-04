package edu.nuaa.lambda;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/3 22:19
 */
public class InnerClassTest {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello, inner class");
            }
        };
        r1.run();
    }
}
