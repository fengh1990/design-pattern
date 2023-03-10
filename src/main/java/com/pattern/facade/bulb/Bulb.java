package com.pattern.facade.bulb;

import com.pattern.facade.Equipment;

import java.text.MessageFormat;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-24
 */
public abstract class Bulb implements Equipment {

    @Override
    public void open() {
        System.out.println(MessageFormat.format("{0}已打开", attachEffect()));
    }

    @Override
    public void close() {
        System.out.println(MessageFormat.format("{0}已关闭", attachEffect()));
    }

    @Override
    public void showEffects() {
        System.out.println(attachEffect());
    }

    public abstract String attachEffect();
}
