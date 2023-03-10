package com.pattern.proxy.staticproxy;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-2-27
 */
public class TeacherDaoProxy implements TeacherDao{
    private TeacherDao target;

    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {

        System.out.println("代理前执行操作");
        target.teach();
        System.out.println("代理后执行操作");
    }
}
