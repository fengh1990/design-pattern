package com.pattern.facade.speaker;

import com.pattern.facade.Equipment;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-24
 */
public abstract class Speaker implements Equipment {

    @Override
    public void open() {
        System.out.println("音箱打开");
    }

    @Override
    public void close() {
        System.out.println("音箱关闭");
    }
}
