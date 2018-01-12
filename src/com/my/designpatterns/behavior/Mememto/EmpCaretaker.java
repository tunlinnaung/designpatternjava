package com.my.designpatterns.behavior.Mememto;

import java.util.ArrayDeque;
import java.util.Deque;

public class EmpCaretaker {
    final Deque<EmpMememto> mememtos = new ArrayDeque<>();

    public EmpMememto getMememto() {
        EmpMememto mememto = mememtos.pop();
        return mememto;
    }

    public void addMememto(EmpMememto mememto) {
        mememtos.push(mememto);
    }
}
