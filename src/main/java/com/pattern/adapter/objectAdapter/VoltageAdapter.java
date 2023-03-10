package com.pattern.adapter.objectAdapter;

import org.springframework.util.ObjectUtils;

/**
 * 对象适配器模式(比较常用)
 *
 * @author fengh
 * @date 2023-2-21
 */
public class VoltageAdapter implements Voltage5 {

    /**
     * 聚合关系，代替继承
     */
    private Voltage220 voltage;

    public VoltageAdapter(Voltage220 voltage) {
        this.voltage = voltage;
    }

    public void setVoltage(Voltage220 voltage) {
        this.voltage = voltage;
    }

    @Override
    public int output() {
        if (ObjectUtils.isEmpty(this.voltage)) {
            return 0;
        }
        int sourceVoltage = this.voltage.output220();
        int desVoltage = sourceVoltage / 44;
        System.out.println("适配输出电压" + desVoltage);
        return desVoltage;
    }
}
