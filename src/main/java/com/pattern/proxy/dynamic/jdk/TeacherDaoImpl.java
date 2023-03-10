package com.pattern.proxy.dynamic.jdk;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class TeacherDaoImpl implements TeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中。。。");
    }

    @Override
    public int teachMath(int a, int b) {
        return a + b;
    }
}
