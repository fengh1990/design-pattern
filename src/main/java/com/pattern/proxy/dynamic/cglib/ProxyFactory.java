package com.pattern.proxy.dynamic.cglib;

import javafx.beans.value.ObservableObjectValue;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

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
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback((MethodInterceptor) (obj, method, args, methodProxy) -> {
            System.out.println("cglib 代理开始");
            Object result = methodProxy.invokeSuper(obj, args);
//            Object result = method.invoke(target, objects);
            System.out.println("result=" + result);
            System.out.println("cglib 代理结束");
            return result;
        });
        return enhancer.create();
    }
}
