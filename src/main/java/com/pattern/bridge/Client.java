package com.pattern.bridge;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-21
 */
public class Client {

    public static void main(String[] args) {
        SlidePhone slidePhone = new SlidePhone(new Apple());
        slidePhone.open();
        slidePhone.call();
        slidePhone.close();

        SlidePhone vivo = new SlidePhone(new Vivo());
        vivo.open();
        vivo.call();
        vivo.close();
    }
}
