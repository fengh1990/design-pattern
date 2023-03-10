package com.pattern.flyweight;

import javax.swing.*;
import java.awt.*;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class App extends JFrame {

    private final Color[] supportedColors = new Color[]{Color.BLUE, Color.RED, Color.BLACK, Color.MAGENTA};
    private final JPanel panel = new JPanel();

    public App(int width, int height) {
        super.setSize(width, height);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton refresh = new JButton("refresh");
        refresh.addActionListener(e -> {
            clearPanel();
            randomDraw();
        });
        Container contentPane = super.getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(refresh, BorderLayout.SOUTH);
    }

    private void clearPanel() {
        Graphics graphics = panel.getGraphics();
        graphics.setColor(Color.WHITE);
        super.paint(graphics);//清除画面内容
    }

    private void randomDraw() {
        for (int i = 0; i < 100; i++) {
            ShapeFactory.getShape(getRandomShape()).draw(panel.getGraphics(), getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomColor());
        }
    }

    private SupportedShape getRandomShape() {
        SupportedShape[] values = SupportedShape.values();
        return values[((int) (Math.random() * values.length))];
    }

    private int getRandomX() {
        return ((int) (super.getSize().width * Math.random()));
    }

    private int getRandomY() {
        return ((int) (super.getSize().height * Math.random()));
    }

    /**
     * 获取一个随机的图像宽度
     *
     * @return 宽度，范围在0~画布宽度的十分之一
     */
    private int getRandomWidth() {
        return (int) (Math.random() * (super.getSize().width / 10));
    }

    /**
     * 获取一个随机的图像高度
     *
     * @return 高度，范围在0~画布高度的十分之一
     */
    private int getRandomHeight() {
        return (int) (Math.random() * (super.getSize().height / 10));
    }

    /**
     * 获取一个随机的颜色
     *
     * @return 颜色
     */
    private Color getRandomColor() {
        int index = (int) (Math.random() * supportedColors.length);
        return supportedColors[index];
    }
}
