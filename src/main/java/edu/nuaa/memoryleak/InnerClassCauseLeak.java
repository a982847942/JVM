package edu.nuaa.memoryleak;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/12 15:43
 */
public class InnerClassCauseLeak {
    private String s = "abc";

    class Inner{
        public InnerClassCauseLeak leakObj;

        public Inner(InnerClassCauseLeak leakObj) {
            this.leakObj = leakObj;
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        /**
         * new InnerClassCauseLeak()要等到 temp释放时候才会被释放
         */
        Inner temp = new InnerClassCauseLeak().new Inner(new InnerClassCauseLeak());
    }
}
