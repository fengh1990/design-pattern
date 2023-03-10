package com.pattern.decorator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-22
 */
public class Chocolate extends DrinkDecorator{
    protected Chocolate( Drink drink) {
        super("Chocolate", 2.0D, drink);
    }
}
