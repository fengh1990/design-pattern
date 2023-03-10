package com.pattern.singleton;

/**
 * 单例模式--饿汉式(静态变量)
 * 这种单例模式可用，但是不能实现懒加载的目的，可能会造成内存浪费
 *
 * @author fengh
 * @date 2021-12-16
 */
public class Type1 {

    //1. 构造器私有化, 外部不能new
    private Type1(){}
    //2.本类内部创建对象实例
    private final static Type1 INSTANCE =new Type1();
    //3. 提供一个公有的静态方法，返回实例对象
    public static Type1 getInstance(){
        return INSTANCE;
    }


    public static void main(String[] args) {
        Type1 instance = Type1.getInstance();
        Type1 instance1 = Type1.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

