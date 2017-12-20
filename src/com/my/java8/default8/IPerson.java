package com.my.java8.default8;

public interface IPerson<P extends Person>
{
    P create(String firstName, String lastName);
}
