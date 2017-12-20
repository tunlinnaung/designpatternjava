package com.my.designpatterns.structural.proxy;

public class ReportGeneratorProxy implements ReportGenerator {
    private ReportGenerator reportGeneratorImpl;
    private Role role;

    public ReportGeneratorProxy(Role role) {
        this.role = role;
    }

    @Override
    public void displayReportTempaltes(String templateName, int templateCount) {
        System.out.println("Displaying report templates with name (" + templateName + ") have " + templateCount + " rows.");
    }

    @Override
    public void generateComplexReport(String templateName, int templateCount) {
        if (reportGeneratorImpl == null)
            reportGeneratorImpl = new ReportGeneratorImpl();
        reportGeneratorImpl.generateComplexReport(templateName, templateCount);
    }

    @Override
    public void generateSensitiveReport() {
        if (role.getRole().equals("Manager")) {
            if (reportGeneratorImpl == null)
                reportGeneratorImpl = new ReportGeneratorImpl();
            reportGeneratorImpl.generateSensitiveReport();
        }
    }
}
