package com.my.designpatterns.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class PatternAggregateImpl implements PatternAggregate {
    List<DesignPattern> designPatterns;

    public PatternAggregateImpl() {
        designPatterns = new ArrayList<>();
    }

    @Override
    public void addPattern(DesignPattern pattern) {
        designPatterns.add(pattern);
    }

    @Override
    public void removePattern(DesignPattern pattern) {
        designPatterns.remove(pattern);
    }

    @Override
    public PatternIterator getPatternIterator() {
        return new PatternIteratorImpl(designPatterns);
    }
}
