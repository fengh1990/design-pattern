package com.pattern.mediator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-8
 */
public class Light extends Equipment{
    public final static String NAME = "Light";
    protected Light(Mediator mediator) {
        super(NAME, mediator);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("电灯打开");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("电灯关闭");
    }
}
