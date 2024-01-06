package edu.nuaa.lambda;

/**
 * java -Djdk.internal.lambda.dumpProxyClasses=. Test
 * @author brain
 * @version 1.0
 * @date 2024/1/3 22:22
 */
public class LambdaTest {


    public static void main(String[] args) {
        Runnable r = ()->{
            System.out.println("hello, lambda");
        };
        r.run();
    }


}
