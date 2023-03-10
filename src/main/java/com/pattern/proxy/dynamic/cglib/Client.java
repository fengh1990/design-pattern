package com.pattern.proxy.dynamic.cglib;

import com.pattern.proxy.dynamic.jdk.TeacherDaoImpl;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class Client {

    public static void main(String[] args) {
        TeacherDaoImpl dao = (TeacherDaoImpl) new ProxyFactory(new TeacherDaoImpl()).getProxyInstance();
        System.out.println(dao.teachMath(2, 3));
    }
}
