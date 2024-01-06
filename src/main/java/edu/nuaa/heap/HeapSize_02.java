package edu.nuaa.heap;

import java.util.concurrent.TimeUnit;

/**
 * @Description Xms 10m Xmx 10m
 * -XX:NewRatio:设置新生代与老年代的比例 默认1:2 就-XX:NewRatio=2
 * -XX:SurvivorRatio 设置Eden区域Survivor区的比例 默认是1:8(任意时刻只有一个Survivor可用)
 * -XX:-UseAdaptiveSizePolicy 关闭自适应的内存分配策略
 * -Xmn设置新生代最大内存大小
 * @author brain
 * @version 1.0
 * @date 2024/1/5 21:00
 */
public class HeapSize_02 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("===========HeapSize_02启动===========");
        TimeUnit.SECONDS.sleep(60*20);
    }
}
