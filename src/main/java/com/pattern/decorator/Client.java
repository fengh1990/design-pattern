package com.pattern.decorator;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-22
 */
public class Client {

    public static void main(String[] args) {

        Drink order = new ShortBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order=new Chocolate(order);
        System.out.println(order.cost());

        System.out.println("++++++++++++++++");
        Drink black = new LongBlack();
        black=new Chocolate(black);
        black=new Milk(black);
        System.out.println(black.cost());
    }
}
