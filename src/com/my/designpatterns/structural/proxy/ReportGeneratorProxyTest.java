package com.my.designpatterns.structural.proxy;

public class ReportGeneratorProxyTest {
    public static void main(String[] args) {
        Role role = new Role("Manager");
        ReportGenerator reportGeneratorImpl = new ReportGeneratorProxy(role);
        reportGeneratorImpl.displayReportTempaltes("pdf", 150);
        reportGeneratorImpl.generateComplexReport("pdf", 200);
        reportGeneratorImpl.generateSensitiveReport();
    }
}
