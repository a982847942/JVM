package java.lang;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/3 18:22
 */
public class String {
    static {
        System.out.println("自定义String被执行了");
    }

    /**
     * 沙箱安全机制
     * 错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
     * public static void main(String[] args)
     * 否则 JavaFX 应用程序类必须扩展javafx.application.Application
     * 这个错误说明执行的启动类加载器加载了JDK自带的String
     * @param args
     */
//    public static void main(String[] args) {
//        System.out.println("hello world");
//    }
}
