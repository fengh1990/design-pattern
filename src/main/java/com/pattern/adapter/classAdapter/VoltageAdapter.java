package com.pattern.adapter.classAdapter;

/**
 * 类适配器模型
 *
 * @author fengh
 * @date 2023-2-21
 */
public class VoltageAdapter extends Voltage220 implements Voltage5 {
    @Override
    public int output() {
        int sourceVoltage = super.output220();
        int desVoltage = sourceVoltage / 44;
        System.out.println("适配输出电压" + desVoltage);
        return desVoltage;
    }
}
