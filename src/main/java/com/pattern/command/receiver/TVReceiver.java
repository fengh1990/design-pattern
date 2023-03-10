package com.pattern.command.receiver;

/**
 * 接受者（具体操作执行者）
 *
 * @author fengh
 * @date 2023-3-1
 */
public class TVReceiver implements Equipment {


    @Override
    public void on() {
        System.out.println("电视机打开");
    }

    @Override
    public void off() {
        System.out.println("电视机关闭");
    }
}
