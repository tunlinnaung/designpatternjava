package com.my.java8.default8;

import java.util.Optional;

public class OptionalTest
{
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("a");

        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.get());
        System.out.println(stringOptional.orElse("tun"));

        stringOptional.ifPresent(System.out::println);
    }
}
