package com.pattern.bridge;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-21
 */
public class SlidePhone extends Phone {
    protected SlidePhone(PhoneBrand phoneBrand) {
        super(phoneBrand, "滑盖手机");
    }

    @Override
    public void open() {
        System.out.println(style);
        super.open();

    }

    @Override
    public void close() {
        System.out.println(style);
        super.close();
    }

    @Override
    public void call() {
        System.out.println(style);
        super.call();
    }
}
