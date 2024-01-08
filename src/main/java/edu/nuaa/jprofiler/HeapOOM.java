package edu.nuaa.jprofiler;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms 8m Xmx8m  -XX:+HeapDumpOnOutOfMemoryError
 * @author brain
 * @version 1.0
 * @date 2024/1/8 19:09
 */
public class HeapOOM {
    byte[] buffer = new byte[1*1024*1024];
    public static void main(String[] args) {
        List<HeapOOM> list = new ArrayList<>();
        int count = 0;
        try {
            while (true){
                list.add(new HeapOOM());
                count++;
            }
        }catch (Throwable e){
            System.out.println("count=" + count);
            e.printStackTrace();
        }
    }
}
