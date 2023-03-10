package com.pattern.interpret;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-9
 */
public interface Expression {

    /**
     * 鉴权
     * @param userKey 用户
     * @return 是否有权限
     */
    boolean authenticate(String userKey);
}
