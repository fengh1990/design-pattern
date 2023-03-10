package com.pattern.mediator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-8
 */
public class RemoteController extends Equipment {

    public final static String NAME = "RemoteController";

    protected RemoteController(Mediator mediator) {
        super("RemoteController", mediator);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("按动遥控器开机按钮");
        getMediator().equipmentStatusChanged(this);
    }

    @Override
    public void close() {
        super.close();
        System.out.println("按动遥控器关机按钮");
        getMediator().equipmentStatusChanged(this);
    }
}
