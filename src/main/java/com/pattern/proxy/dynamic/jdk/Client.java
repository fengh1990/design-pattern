package com.pattern.proxy.dynamic.jdk;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDaoImpl());
        TeacherDao teacherDao = (TeacherDao) proxyFactory.getProxyInstance();
        System.out.println(teacherDao.teachMath(1, 2));
    }
}
