package com.my.designpatterns.behavior.interpreter;

public class AdditionExpression implements Expression {

    private Expression firstExpression, secondExpression;

    public AdditionExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return firstExpression.interpret() + secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
