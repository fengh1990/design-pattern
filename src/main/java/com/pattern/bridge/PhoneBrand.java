package com.pattern.bridge;

/**
 * 实现的接口
 *
 * @author fengh
 * @date 2023-2-21
 */
public abstract class PhoneBrand {

    protected final String name;

    protected PhoneBrand(String name) {
        this.name = name;
    }

    abstract void open();

    abstract void close();

    abstract void call();

    public static void main(String[] args) {
        Integer num1 = Integer.valueOf("90");
        Integer num2 = Integer.valueOf(90);
        System.out.println(num1.equals(num2));
    }
}
