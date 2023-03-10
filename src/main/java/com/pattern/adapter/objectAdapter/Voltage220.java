package com.pattern.adapter.objectAdapter;

/**
 * 被适配者（source）
 *
 * @author fengh
 * @date 2023-2-21
 */
public class Voltage220 {

    public int output220() {
        System.out.println("源头输出电压220v");
        return 220;
    }
}
