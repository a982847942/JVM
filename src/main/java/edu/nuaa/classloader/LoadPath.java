package edu.nuaa.classloader;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/3 18:07
 */
public class LoadPath {
    public static void main(String[] args) {
        /**
         * 获取启动类加载器能够加载的路径 启动类加载器只加载java javax sun开头的字节码
         */
        System.out.println("================启动类加载器================");
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }

        /**
         * 扩展类加载器没有限制，把自己写的源码编译后的字节码放在这些目录下，一样会被扩展类加载器加载
         */
        System.out.println("================扩展类加载器================");
        String existDirs = System.getProperty("java.ext.dirs");
        for (String path : existDirs.split(";")) {
            System.out.println(path);
        }
    }
}
