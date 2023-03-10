package com.pattern.interpret.symbol;

import com.pattern.interpret.Expression;

/**
 * 或运算
 *
 * @author fengh
 * @date 2023-3-9
 */
public class OrExpression extends AbstractSymbolExpression {
    public OrExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public boolean authenticate(String userKey) {
        return getLeft().authenticate(userKey) || getRight().authenticate(userKey);
    }
}
