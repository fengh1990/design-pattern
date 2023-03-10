package com.pattern.singleton;

/**
 * 懒汉式，线程不安全，实际开发不要使用
 *
 * @author fengh
 * @date 2021-12-16
 */
public class Type3 {

    private Type3(){}
    private static Type3 instance;
    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    //即懒汉式
    public static Type3 getInstance(){
        if (instance == null) {
            instance=new Type3();
        }
        return instance;
    }
}
