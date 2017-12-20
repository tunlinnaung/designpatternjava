package com.my.designpatterns.structural.adapter;

public class CSVFormatter implements CSVFormattable {
    @Override
    public String formatCsvText(String text) {
        String formattedCsvText = text.replace(".", ",");
        return formattedCsvText;
    }
}
