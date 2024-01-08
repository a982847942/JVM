package edu.nuaa.string;


/**
 * @author brain
 * @version 1.0
 * @date 2024/1/8 11:39
 */
public class Operation_Plus {
    public static void main(String[] args) {

        test_01();
        test_02();
    }

    static void test_00() {
        String s1 = "a";
        String str1 = s1 + "b" + "c"; // ==为false一个时String对象  一个在字符串常量池
//        String str1 = "a" +  "b" + "c";  ==为true  都在字符串常量池
        String str2 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    static void test_01() {
        String s1 = "a";
        String s2 = "b";
        String s3 = s1 + s2;
        String s4 = "ab";
        System.out.println(s3 == s4); //false
    }

    static void test_02() {
        final String s1 = "a";
        final String s2 = "b";
        String s3 = s1 + s2;
        String s4 = "ab";
        System.out.println(s3 == s4);//true
    }

    static void test_03(){
        char[] s = {'a','b','c'};
        String s1 = new String(s, 0, s.length);
    }
}
