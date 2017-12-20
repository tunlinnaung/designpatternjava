package com.my.designpatterns.structural.proxy;

public interface ReportGenerator {
    void displayReportTempaltes(String templateName, int templateCount);
    void generateComplexReport(String templateName, int templateCount);
    void generateSensitiveReport();
}
