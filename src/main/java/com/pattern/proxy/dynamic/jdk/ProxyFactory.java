package com.pattern.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;
import java.text.MessageFormat;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class ProxyFactory {

    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println(MessageFormat.format("开始代理方法{0},参数:{1}", method.getName(), args));
            Object result = method.invoke(target, args);
            System.out.println(MessageFormat.format("代理提交，结果：{0}", result));
            return result;
        });
    }
}
