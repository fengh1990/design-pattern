package com.pattern.decorator;

import org.springframework.util.ObjectUtils;

import java.awt.image.DirectColorModel;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-22
 */
public class DrinkDecorator extends Drink {
    private final Drink drink;

    protected DrinkDecorator(String desc, Double price, Drink drink) {
        super(desc, price);
        this.drink = drink;
    }

    @Override
    public Double cost() {
        if (ObjectUtils.isEmpty(drink)) {
            return price;
        }

        System.out.println(drinkDetail(this));
        double result = price + drink.cost();
        return result;
    }


}
