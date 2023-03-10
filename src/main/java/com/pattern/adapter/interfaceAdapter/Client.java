package com.pattern.adapter.interfaceAdapter;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-21
 */
public class Client {

    public static void main(String[] args) {
        MyInterfaceAdapter adapter = new MyInterfaceAdapter() {
            @Override
            public void func1() {
                System.out.println("实现func1");
            }
        };

        adapter.func1();
    }
}
