package com.my.java8.default8;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class Person
{
    String firstName;
    String lastName;

    Person() {
        this.firstName = "default";
        this.lastName = "default";
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
