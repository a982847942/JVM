package edu.nuaa.memoryleak;

import java.util.ArrayList;
import java.util.List;


/**
 * @author brain
 * @version 1.0
 * @date 2024/1/12 15:37
 */
public class StaticFieldCauseLeak {
    /**
     * 静态对象生命周期与堆区该类的Class对象相同，因此导致object生命周期变长，造成泄露
     */
    static List<Object> list = new ArrayList<>();
    public static void main(String[] args) {
        Object object = new Object();
        list.add(object);
    }
}
