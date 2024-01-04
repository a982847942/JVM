package edu.nuaa.classloader;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/3 19:34
 */
public class ClinitAndInit {
    static {
        System.out.println("静态代码块和静态变量会生成Clinit方法");
    }
    public void print(String info){
        System.out.println("=========" + info + "=========");
    }
    public static void main(String[] args) {
        ClinitAndInit temp = new ClinitAndInit();
        System.out.println("hehe");
    }
}
