package com.my.java8.default8;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class StreamTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("aaa");
        stringList.add("aaa1");
        stringList.add("bbb");
        stringList.add("ccc");

//        filter(stringList);
//        match(stringList);
//        count(stringList);
//        reduce(stringList);
        countParallel();
    }

    static void countParallel()
    {
        int max = 10000000;
        List<String> values = new ArrayList<>();
        for (int i = 0 ; i < max ; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        sequentailSort(values);
        parallelSort(values);
    }

    static void sequentailSort(List<String> values) {
        long e0 = System.nanoTime();

        long count = values.stream().sorted().count();
        System.out.println(count);

        long e1 = System.nanoTime();

        long millsec = TimeUnit.NANOSECONDS.toMillis(e1 - e0);
        System.out.println(String.format("sequential sort tool %d ms", millsec));
    }
    static void parallelSort(List<String> values) {
        long e0 = System.nanoTime();

        long count = values.parallelStream().sorted().count();
        System.out.println(count);

        long e1 = System.nanoTime();

        long millsec = TimeUnit.NANOSECONDS.toMillis(e1 - e0);
        System.out.println(String.format("parallel sort tool %d ms", millsec));
    }

    static void reduce(List<String> stringList) {
        Optional<String> reducedString =
                stringList
                        .stream()
                        .sorted()
                        .filter(s -> s.startsWith("a"))
                        .reduce((s1, s2) -> s1 + "#" + s2);
        reducedString.ifPresent(System.out::println);
    }

    static void count(List<String> stringList) {
        long count = stringList.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(count);
    }

    static void filter(List<String> stringList) {
        stringList.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
        stringList.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);
        stringList.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        stringList.parallelStream();
    }

    static void match(List<String> stringList) {
        boolean anyMatch = stringList.stream().anyMatch(s -> s.startsWith("a"));
        System.out.println(anyMatch);

        boolean allMatch = stringList.stream().allMatch(s -> s.startsWith("a"));
        System.out.println(allMatch);

        boolean noneMatch = stringList.stream().noneMatch(s -> s.startsWith("a"));
        System.out.println(noneMatch);
    }
}
