package com.pattern.mediator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-8
 */
public abstract class Equipment {

    private final String name;
    private boolean open;
    private final Mediator mediator;

    protected Equipment(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.open = false;
    }

    public String getName() {
        return name;
    }

    public boolean isOpen() {
        return open;
    }

    public void open(){
        this.open=true;
    }

    public void close(){
        this.open=false;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
