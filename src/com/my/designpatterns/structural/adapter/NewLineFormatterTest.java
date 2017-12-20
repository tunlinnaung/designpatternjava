package com.my.designpatterns.structural.adapter;

public class NewLineFormatterTest {

    public static void main(String[] args) {
        String text = "Text 1. Text 2. Text 3";
        TextFormattable textFormattable = new NewLineFormatter();
        String resultString = textFormattable.formatText(text);
        System.out.println("Text Formatter : " + resultString);


        CSVFormatter csvFormatter = new CSVFormatter();
        TextFormattable csvTextFormattable = new CSVAdapterImpl(csvFormatter);
        String csvResultString = csvTextFormattable.formatText(text);
        System.out.println("CSV Text Formatter : " + csvResultString);
    }
}
