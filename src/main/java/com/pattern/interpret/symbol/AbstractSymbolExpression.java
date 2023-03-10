package com.pattern.interpret.symbol;

import com.pattern.interpret.Expression;

/**
 * 符号表达式
 *
 * @author fengh
 * @date 2023-3-9
 */
public abstract class AbstractSymbolExpression implements Expression {

    private final Expression left;
    private final Expression right;

    protected AbstractSymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
