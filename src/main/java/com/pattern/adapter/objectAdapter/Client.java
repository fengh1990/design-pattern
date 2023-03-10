package com.pattern.adapter.objectAdapter;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-21
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter(new Voltage220()));
    }
}
