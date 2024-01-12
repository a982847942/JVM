package edu.nuaa.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/12 11:53
 */
public class VisualVM {

    public static void main(String[] args) {
        List<Picture> list = new ArrayList<>();
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(5);
                list.add(new Picture(new Random().nextInt(100 * 50) + 1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
