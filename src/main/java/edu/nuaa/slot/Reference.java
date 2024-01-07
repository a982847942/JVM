package edu.nuaa.slot;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * 关闭指针压缩-XX:-UseCompressedOops
 * @author brain
 * @version 1.0
 * @date 2024/1/7 9:55
 */
public class Reference {
    static Long t = 10L;
    public Reference() {
        System.out.println("init");
    }

    public static void main(String[] args) throws IOException {
        long lTemp = 10L;
        int iTemp = 5;
        double dTemp = 2.5d;
        char cTemp = 'a';
        Reference rTemp = new Reference();
        short sTemp = 2;
        System.out.println(Reference.t);
        System.in.read();
    }
}
