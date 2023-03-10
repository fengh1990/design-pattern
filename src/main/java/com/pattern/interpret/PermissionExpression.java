package com.pattern.interpret;

/**
 * 权限表达式
 *
 * @author fengh
 * @date 2023-3-9
 */
public class PermissionExpression implements Expression {

    private final String auth;
    private final PermissionType type;

    public PermissionExpression(String auth, PermissionType type) {
        this.auth = auth;
        this.type = type;
    }

    @Override
    public boolean authenticate(String userKey) {
        switch (type) {
            case ROLE:
                return Simulation.getUserConfig(userKey).getRoles().contains(auth);
            case ELEMENT:
                return Simulation.getUserConfig(userKey).getElements().contains(auth);
            default:
                throw new UnsupportedOperationException("权限类型不存在");
        }
    }
}
