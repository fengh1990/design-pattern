package com.pattern.flyweight;

import java.awt.*;
import java.text.MessageFormat;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class Oval implements Shape {

    /**
     * 内部状态，是否填充图形
     */
    private final Boolean fill;

    public Oval(Boolean fill) {
        this.fill = fill;
        System.out.println(MessageFormat.format("创建新的Oval对象,fill={0}",fill));
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color c) {
        g.setColor(c);
        if (fill) {
            g.fillOval(x, y, width, height);
            return;
        }
        g.drawOval(x, y, width, height);
    }
}
