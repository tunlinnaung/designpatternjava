package com.my.designpatterns.structural.adapter;

public class CSVAdapterImpl implements TextFormattable {
    private CSVFormatter csvFormatter;

    public CSVAdapterImpl(CSVFormatter csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        String formattedText = csvFormatter.formatCsvText(text);
        return formattedText;
    }
}
