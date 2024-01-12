package edu.nuaa.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/12 11:57
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024*100) + 1];

    public static void main(String[] args) {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<HeapInstanceTest> list = new ArrayList<>();
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(5);
                list.add(new HeapInstanceTest());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
