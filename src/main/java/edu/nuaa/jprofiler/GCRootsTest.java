package edu.nuaa.jprofiler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


/**
 * @author brain
 * @version 1.0
 * @date 2024/1/8 18:59
 */
public class GCRootsTest {
    public static void main(String[] args) throws IOException {
        List<Object> numList = new ArrayList<>();
        Date date = new Date();
        for (int i = 0; i < 100; i++) {
            numList.add(String.valueOf(i));
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数据库添加完毕,请操作: ");
        new Scanner(System.in).next();
        numList = null;
        date = null;
        System.gc();
        System.in.read();
    }
}
