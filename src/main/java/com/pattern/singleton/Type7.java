package com.pattern.singleton;

/**
 * 静态内部类,线程安全，懒加载，效率高，推荐使用
 *
 * @author fengh
 * @date 2021-12-16
 */
public class Type7 {
    private Type7(){}
    private static  class Holder{
        private final static Type7 INSTANCE=new Type7();
    }

    public static Type7 getInstance(){
        return Holder.INSTANCE;
    }
}
