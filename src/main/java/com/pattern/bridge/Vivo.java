package com.pattern.bridge;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-21
 */
public class Vivo extends PhoneBrand{
    protected Vivo() {
        super("vivo");
    }

    @Override
    public void open() {
        System.out.println(name+"手机开机");
    }

    @Override
    public void close() {
        System.out.println(name+"手机开机");
    }

    @Override
    public void call() {
        System.out.println(name+"手机拨打电话");
    }
}
