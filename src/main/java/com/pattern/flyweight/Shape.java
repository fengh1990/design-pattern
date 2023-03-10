package com.pattern.flyweight;

import java.awt.*;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public interface Shape {
    /**
     * 绘制当前图像到屏幕上
     *
     * @param g      g
     * @param x      图像的左上角X坐标
     * @param y      图像的左上角Y坐标
     * @param width  图像的宽度
     * @param height 图像的高度
     * @param c      颜色
     */
    void draw(Graphics g, int x, int y, int width, int height, Color c);
}
