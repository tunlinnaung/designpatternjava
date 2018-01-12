package com.my.designpatterns.behavior.Mememto;

public class EmpMememto {
    private int empId;
    private String empName;
    private String empPhoneNo;
    private String empDesignation;

    public EmpMememto(int empId, String empName, String empPhoneNo, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empDesignation = empDesignation;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    @Override
    public String toString() {
        String str = "Current mememto object : " + this.empId + ", " + this.empName + ", " + this.empPhoneNo + ", " + this.empDesignation;
        return str;
    }
}
