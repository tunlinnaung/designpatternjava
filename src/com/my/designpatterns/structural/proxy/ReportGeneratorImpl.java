package com.my.designpatterns.structural.proxy;

public class ReportGeneratorImpl implements ReportGenerator {
    public ReportGeneratorImpl() {
        System.out.println("Generating ReportGeneratorImpl().");
    }

    @Override
    public void displayReportTempaltes(String templateName, int templateCount) {

    }

    @Override
    public void generateComplexReport(String templateName, int templateCount) {
        System.out.println("Generating complex report with name (" + templateName + ") have " + templateCount + " rows.");
    }

    @Override
    public void generateSensitiveReport() {
        System.out.println("Generating sensitive report for authorized user.");
    }
}
