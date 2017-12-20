package com.my.java8.default8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("tun", "lin", "aung");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        System.out.println("List : " + names.toString());

        Collections.sort(names, Comparator.reverseOrder());

        System.out.println("Reverse List : " + names.toString());

        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        System.out.println("Reverse lambda List : " + names.toString());

        Collections.sort(names, (a, b) -> b.compareTo(a));

        System.out.println("Reverse Simple lambda List : " + names.toString());

        names.forEach(a -> System.out.println(a));
    }
}
