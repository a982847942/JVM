package edu.nuaa.generictype;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @author brain
 * @version 1.0
 * @date 2024/1/5 15:58
 */
public class ReflectGetParameterType {
    class Demo1<T> {
        public void study(Map<String, Integer> map, T t, String str) {
        }
    }

    /*
     * 继承泛型父类并指定String类型
     * */
    public class Demo2 extends Demo1<String>{
    }

    static void testClassGeneric(){
        Demo2 demo = new ReflectGetParameterType().new Demo2();
        //获得带有泛型的父类
        Type genericSuperclass = demo.getClass().getGenericSuperclass();
        //判断父类是不是参数化的类型，如果是强转成ParameterizedType
        if (genericSuperclass instanceof ParameterizedType){
            ParameterizedType parameterizedType = (ParameterizedType)genericSuperclass;
            //获得Demo1<String>，<>中的实际类型参数
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            //获得参数类型
            Class<?> clazz = (Class<?>)actualTypeArguments[0];
            System.out.println(clazz);
        }
    }

    public static void main(String[] args) {
        testMethodGeneric();
    }

    static void testMethodGeneric(){
        try {
            //通过反射获得该方法
            Method study =ReflectGetParameterType.class.getMethod("study", Map.class, List.class);
            //获得该方法的所有参数类型
            Type[] genericParameterTypes = study.getGenericParameterTypes();
            for (Type type : genericParameterTypes){
                System.out.println("##"+ type);
                //如果参数为参数化的类型进行强转
                if (type instanceof ParameterizedType){
                    ParameterizedType parameterizedType = (ParameterizedType)type;
                    //获得参数化类型中实际参数(Map<String, Integer> 中<>内定义的参数)
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    //遍历输出
                    for (Type tt : actualTypeArguments){
                        System.out.println(tt);
                    }
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    //一个方法有Map类型和List类型的参数，并指定泛型
    public void study(Map<String, Integer> map, List<String> list){

    }
}
