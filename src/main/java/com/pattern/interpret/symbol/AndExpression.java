package com.pattern.interpret.symbol;

import com.pattern.interpret.Expression;

/**
 * 与运算
 *
 * @author fengh
 * @date 2023-3-9
 */
public class AndExpression extends AbstractSymbolExpression {
    public AndExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public boolean authenticate(String userKey) {
        return getLeft().authenticate(userKey) && getRight().authenticate(userKey);
    }
}
