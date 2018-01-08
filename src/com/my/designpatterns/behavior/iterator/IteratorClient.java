package com.my.designpatterns.behavior.iterator;

public class IteratorClient {

    public static void main(String[] args) {
        DesignPattern pattern1 = new DesignPattern("Creational", "Factory Method");
        DesignPattern pattern2 = new DesignPattern("Creational", "Abstract Factory Method");
        DesignPattern pattern3 = new DesignPattern("Structural", "Builder");
        DesignPattern pattern4 = new DesignPattern("Structural", "Bridge");
        DesignPattern pattern5 = new DesignPattern("Behavioral", "Chain Of Responsibility");
        DesignPattern pattern6 = new DesignPattern("Structural", "Iterator");

        PatternAggregate aggregate = new PatternAggregateImpl();
        aggregate.addPattern(pattern1);
        aggregate.addPattern(pattern2);
        aggregate.addPattern(pattern3);
        aggregate.addPattern(pattern4);
        aggregate.addPattern(pattern5);
        aggregate.addPattern(pattern6);

        printPatterns(aggregate);

        aggregate.removePattern(pattern1);
        aggregate.removePattern(pattern3);

        printPatterns(aggregate);
    }

    private static void printPatterns(PatternAggregate aggregate) {
        PatternIterator iterator = aggregate.getPatternIterator();
        while (!iterator.isLastObject()) {
            DesignPattern pattern = iterator.nextItem();
            System.out.println("Type : " + pattern.getType() + " - Name : " + pattern.getName());
        }
        System.out.println("==================================================");
    }

}
