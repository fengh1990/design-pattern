package com.pattern.adapter.interfaceAdapter;

/**
 * 接口适配器模式，对方法进行空实现，由匿名类进行按需覆写
 *
 * @author fengh
 * @date 2023-2-21
 */
public abstract class MyInterfaceAdapter implements MyInterface {

    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }

    @Override
    public void func3() {

    }

    @Override
    public void func4() {

    }
}
