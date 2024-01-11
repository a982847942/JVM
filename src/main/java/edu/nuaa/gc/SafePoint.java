package edu.nuaa.gc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/11 21:11
 */
public class SafePoint {
    public static AtomicInteger num = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = ()->{
            /**
             * JDK10以上优化了counted-loop，测试无意义
             *
             */
            for (/**long*/int i = 0; i < 10_0000_0000; i++) {
                num.getAndAdd(1);
            }
            System.out.println(Thread.currentThread().getName() + "执行结束!");
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("num=" + num);
    }
}
