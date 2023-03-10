package com.pattern.adapter.classAdapter;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-21
 */
public class Phone {

    public void charge(Voltage5 voltage) {
        int output = voltage.output();
        if (output == 5) {
            System.out.println("手机充电" + output);
            return;
        }
        throw new RuntimeException("电压" + output + "不符合充电要求");
    }
}
