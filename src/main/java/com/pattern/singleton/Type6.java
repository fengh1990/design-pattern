package com.pattern.singleton;

import jdk.nashorn.internal.ir.IfNode;

/**
 * 懒汉式，双重检测
 * 解决线程安全问题, 同时解决懒加载问题，同时保证了效率, 推荐使用
 *
 * @author fengh
 * @date 2021-12-16
 */
public class Type6 {
    private Type6(){}
    //声明成volatile，保证可见性
    private static volatile Type6 instance;
    public static Type6 getInstance(){
        if (instance == null) {
            synchronized (Type6.class){
                if (instance == null) {
                    instance=new Type6();
                }
            }
        }
        return instance;
    }
}
