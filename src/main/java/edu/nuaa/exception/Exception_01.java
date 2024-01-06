package edu.nuaa.exception;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/4 15:50
 */
public class Exception_01 {
    public static int foo() {
        int x = 0;
        try {
            return x;
        } finally {
            ++x;
        }
    }

    public static void main(String[] args) {
        int res = foo();
        System.out.println(res);
    }
}
