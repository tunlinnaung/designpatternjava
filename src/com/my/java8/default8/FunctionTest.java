package com.my.java8.default8;

import java.util.function.Function;

public class FunctionTest
{
    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123");

    }
}
