package com.pattern.mediator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-8
 */
public class TV extends Equipment{
    public final static String NAME = "TV";
    protected TV(Mediator mediator) {
        super(NAME, mediator);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("电视机打开");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("电视机关闭");
    }
}
