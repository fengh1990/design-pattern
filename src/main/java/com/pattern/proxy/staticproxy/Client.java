package com.pattern.proxy.staticproxy;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class Client {
    public static void main(String[] args) {
        new TeacherDaoProxy(new TeacherDaoImpl()).teach();
    }
}
