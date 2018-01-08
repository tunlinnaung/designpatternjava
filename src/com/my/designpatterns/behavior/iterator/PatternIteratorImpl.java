package com.my.designpatterns.behavior.iterator;

import java.util.List;

public class PatternIteratorImpl implements PatternIterator {
    private List<DesignPattern> designPatterns;
    private int position;
    private DesignPattern designPattern;

    public PatternIteratorImpl(List<DesignPattern> designPatterns) {
        this.designPatterns = designPatterns;
    }

    @Override
    public DesignPattern nextItem() {
        System.out.println("Current position : " + position);
        designPattern = designPatterns.get(position);
        position++;
        return designPattern;
    }

    @Override
    public boolean isLastObject() {
        return position >= designPatterns.size();
    }
}
