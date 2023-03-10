package com.pattern.singleton;

/**
 * 使用枚举实现单例，推荐使用
 *
 * @author fengh
 * @date 2021-12-16
 */
public enum Type8 {
    INSTANCE;//属性
    public void say(){
        System.out.println("hello");
    }
}

class Test{
    public static void main(String[] args) {
        Type8 instance = Type8.INSTANCE;
        Type8 instance1 = Type8.INSTANCE;
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        instance.say();

        //jdk ，使用饿汉模式实现单例模式
        Runtime runtime = Runtime.getRuntime();
    }
}
