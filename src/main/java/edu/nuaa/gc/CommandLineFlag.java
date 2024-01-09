package edu.nuaa.gc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * -XX:+PrintCommandLineFlags 打印参数
 * -XX:+UseSerialGC 指定新生代垃圾收集器，此时老年代默认使用SerialOld
 * -XX:+UseParNewGC 新生代使用ParNew
 * -XX:+UseParallelGC 老年代默认ParallelOld
 * -XX:ParallelGCThread 设置年轻代并行收集的线程数 一般最好与CPU数目相等，避免线程切换等因素影响垃圾回收性能
 * 默认情况下 CPU<8 其值等于CPU数量
 * CPU>8时  其值等于3 + [5*CPU_COUNT] / 8
 * @author brain
 * @version 1.0
 * @date 2024/1/9 13:33
 */
public class CommandLineFlag {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        System.in.read();
    }
}
