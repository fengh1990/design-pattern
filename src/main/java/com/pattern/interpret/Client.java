package com.pattern.interpret;

import com.pattern.interpret.symbol.AndExpression;
import com.pattern.interpret.symbol.OrExpression;

/**
 * 功能描述
 *
 * @author fengh
 * @date 2023-3-9
 */
public class Client {

    public static void main(String[] args) {
        Expression expression = buildExpression();
        System.out.println(expression.authenticate("lisa"));

        Expression expression1 = buildExpressionForApi2();
        System.out.println(expression1.authenticate("lisa"));
    }

    private static Expression buildExpression() {
        PermissionExpression xls = new PermissionExpression("system.user.export-to-xlsx", PermissionType.ELEMENT);
        PermissionExpression doc = new PermissionExpression("system.user.export-to-docx", PermissionType.ELEMENT);
        OrExpression orExpression = new OrExpression(xls, doc);
        PermissionExpression role = new PermissionExpression("admin", PermissionType.ROLE);
        return new OrExpression(orExpression, role);
    }

    public static Expression buildExpressionForApi2() {
        // 权限表达式
        Expression detail = new PermissionExpression("sys.user.detail", PermissionType.ELEMENT);
        Expression manager = new PermissionExpression("warehouse-manager", PermissionType.ROLE);
        // 符号表达式
        return new AndExpression(detail, manager);
    }
}
