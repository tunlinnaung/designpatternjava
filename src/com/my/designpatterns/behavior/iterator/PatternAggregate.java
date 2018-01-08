package com.my.designpatterns.behavior.iterator;

public interface PatternAggregate {
    void addPattern(DesignPattern pattern);
    void removePattern(DesignPattern pattern);
    PatternIterator getPatternIterator();
}
