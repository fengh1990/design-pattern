package com.pattern.decorator;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-21
 */
public abstract class Coffee extends Drink {
    protected Coffee(String desc, Double price) {
        super(desc, price);
    }

    @Override
    public Double cost() {
        System.out.println(drinkDetail(this));
        return price;
    }
}
