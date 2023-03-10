package com.pattern.singleton;

/**
 * 懒汉式(线程安全，同步方法)
 * 解决线程安全问题，但是效率太低，实际开发不推荐使用
 *
 * @author fengh
 * @date 2021-12-16
 */
public class Type4 {

    private Type4(){}
    private static Type4 instance;
    public static synchronized Type4 getInstance(){
        if (instance == null) {
            instance=new Type4();
        }
        return instance;
    }
}
