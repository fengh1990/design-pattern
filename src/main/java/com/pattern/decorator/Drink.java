package com.pattern.decorator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-21
 */
public abstract class Drink {

    protected final String desc;
    protected final Double price;

    protected Drink(String desc, Double price) {
        this.desc = desc;
        this.price = price;
    }

    public abstract Double cost();

    protected String drinkDetail(Drink drink) {
        return drink.desc + "&" + drink.price + " ";
    }
}
