package com.pattern.singleton;

/**
 * 懒汉式，同步代码块，线程不安全，实际开发中不能使用
 *
 * @author fengh
 * @date 2021-12-16
 */
public class Type5 {

    private Type5(){}
    private static Type5 instance;
    public static Type5 getInstance(){
        if (instance == null) {
            synchronized (Type5.class){
                instance=new Type5();
            }
        }
        return instance;
    }
}
