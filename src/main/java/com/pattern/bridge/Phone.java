package com.pattern.bridge;

/**
 * 抽象层
 *
 * @author fengh
 * @date 2023-2-21
 */
public abstract class Phone {

    private final PhoneBrand phoneBrand;
    protected final String style;

    protected Phone(PhoneBrand phoneBrand, String style) {
        this.phoneBrand = phoneBrand;
        this.style = style;
    }

    public void open() {
        this.phoneBrand.open();
    }

    public void close() {
        this.phoneBrand.close();
    }

    public void call() {
        this.phoneBrand.call();
    }
}
