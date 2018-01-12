package com.my.designpatterns.behavior.Mememto;

public class EmpOriginator {
    private int empId;
    private String empName;
    private String empPhoneNo;
    private String empDesignation;

    public EmpOriginator(int empId, String empName, String empPhoneNo, String empDesignation) {
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empDesignation = empDesignation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public void setEmpPhoneNo(String empPhoneNo) {
        this.empPhoneNo = empPhoneNo;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public EmpMememto saveToMememto() {
        EmpMememto mememto = new EmpMememto(this.empId, this.empName, this.empPhoneNo, this.empDesignation);
        return mememto;
    }

    public void undoMememto(EmpMememto mememto) {
        this.empId = mememto.getEmpId();
        this.empName = mememto.getEmpName();
        this.empPhoneNo = mememto.getEmpPhoneNo();
        this.empDesignation = mememto.getEmpDesignation();
    }

    public void printMememto() {
        System.out.println("ID : " + this.empId);
        System.out.println("Name : " + this.empName);
        System.out.println("Phone : " + this.empPhoneNo);
        System.out.println("Designation : " + this.empDesignation);
    }

}
