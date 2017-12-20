package com.my.java8.default8;

public interface Formula
{
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
