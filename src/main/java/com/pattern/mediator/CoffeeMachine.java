package com.pattern.mediator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-8
 */
public class CoffeeMachine extends Equipment {

    public final static String NAME = "CoffeeMachine";

    protected CoffeeMachine(Mediator mediator) {
        super(NAME, mediator);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("咖啡机开始煮咖啡，请等待...");
        close();
    }

    @Override
    public void close() {
        super.close();
        System.out.println("咖啡机关闭");
        getMediator().equipmentStatusChanged(this);
    }
}
