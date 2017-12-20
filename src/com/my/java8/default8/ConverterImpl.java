package com.my.java8.default8;

@FunctionalInterface
public interface ConverterImpl<K, T> {
    K convert(K k);
}
