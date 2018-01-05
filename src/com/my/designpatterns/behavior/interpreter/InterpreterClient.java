package com.my.designpatterns.behavior.interpreter;

public class InterpreterClient {

    public static void main(String[] args) {
        String parseString = "2 5 1 + *";
        ExpressionParser parser = new ExpressionParser();
        int result = parser.parse(parseString);
        System.out.println("Final result : " + result);
    }

}
