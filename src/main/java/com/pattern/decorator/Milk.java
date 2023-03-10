package com.pattern.decorator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-22
 */
public class Milk extends DrinkDecorator{
    public Milk( Drink drink) {
        super("milk", 1.0D, drink);
    }
}
