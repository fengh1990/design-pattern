package com.pattern.flyweight;

import java.awt.*;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class Line implements Shape {

    public Line() {
        System.out.println("创建新的Line对象");
    }


    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color c) {
        g.setColor(c);
        g.drawLine(x, y, x + width, y + height);
    }
}
