package com.my.designpatterns.behavior.Mememto;

public class MememtoClient {

    public static void main(String[] args) {
        EmpOriginator originator = new EmpOriginator(1, "Tun", "450042454", "java developer");
        EmpMememto empMememto = originator.saveToMememto();
        EmpCaretaker caretaker = new EmpCaretaker();
        caretaker.addMememto(empMememto);
        System.out.println("Original Mememto");
        originator.printMememto();

        System.out.println("\n EmpOriginator after updating phone number");
        originator.setEmpPhoneNo("260011649");
        empMememto = originator.saveToMememto();
        caretaker.addMememto(empMememto);
        originator.printMememto();

        System.out.println("\n EmpOriginator after updating designation");
        originator.setEmpDesignation("Senior java developer");
        empMememto = originator.saveToMememto();
        caretaker.addMememto(empMememto);
        originator.printMememto();

        System.out.println("\n EmpOriginator after rolling back designation");
        empMememto = caretaker.getMememto();
        originator.undoMememto(empMememto);
        empMememto = caretaker.getMememto();
        originator.undoMememto(empMememto);
        originator.printMememto();

        System.out.println("\n EmpOriginator after rolling back phone no");
        empMememto = caretaker.getMememto();
        originator.undoMememto(empMememto);
        originator.printMememto();
    }

}
