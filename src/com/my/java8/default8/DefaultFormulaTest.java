package com.my.java8.default8;

public class DefaultFormulaTest
{
    public static void main(String[] args) {
        Formula formula = Math::sqrt;
        System.out.println(formula.calculate(10));
        System.out.println(formula.sqrt(20));
    }
}
