package com.pattern.chainofresponsibility;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-10
 */
public enum RMBType {
    HUNDRED(100,"一百元"),
    FIFTY(50,"五十元"),
    TEN(10,"十元"),
    ;

    private final int amount;
    private final String name;

    RMBType(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
