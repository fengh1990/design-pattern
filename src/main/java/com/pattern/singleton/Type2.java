package com.pattern.singleton;

/**
 * 单例模式--饿汉式（静态代码块）
 * 这种单例模式可用，但是不能实现懒加载的目的，可能会造成内存浪费
 *
 * @author fengh
 * @date 2021-12-16
 */
public class Type2 {

    private Type2(){}
    private static final Type2 INSTANCE;
    // 在静态代码块中，创建单例对象
    static {
        INSTANCE=new Type2();
    }

    public static Type2 getInstance(){
        return INSTANCE;
    }
}
