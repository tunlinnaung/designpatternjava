package com.my.java8.default8;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateTest
{
    public static void main(String[] args) {
        Predicate<String> predicate = a -> a.length() > 0;
        System.out.println(predicate.test("foo"));
        System.out.println(predicate.negate().test("foo"));

        Predicate<Boolean> isNotNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        System.out.println(isNotNull.test(null));
        System.out.println(isNull.test(null));

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        System.out.println(isEmpty.test("null"));
        System.out.println(isNotEmpty.test("null"));

    }
}
