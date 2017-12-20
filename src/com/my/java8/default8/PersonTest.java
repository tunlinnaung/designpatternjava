package com.my.java8.default8;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PersonTest
{
    public static void main(String[] args) {
        IPerson<Person> person = Person::new;
        Person p = person.create("tun", "lin aung");
        System.out.println("Person : " + p.firstName + ", " + p.lastName);

        Supplier<Person> personSupplier = Person::new;
        System.out.println("Supplier person : " + personSupplier.get().firstName + ", " + personSupplier.get().lastName);

        Consumer<Person> personConsumer = cp -> System.out.println("Hello " + cp.firstName);
        personConsumer.accept(new Person("xxx", "yyy"));

        Comparator<Person> personComparator = Comparator.comparing(p1 -> p1.firstName);

        Person person1 = new Person("aaa", "bbb");
        Person person2 = new Person("ccc", "ddd");

        personComparator.compare(person1, person2);
        personComparator.reversed().compare(person1, person2);
    }
}
