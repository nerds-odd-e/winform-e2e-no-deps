package com.odde.atddv2.nodeps.ice;

import com.zeroc.Ice.Current;

public class PrinterI implements Demo.Printer {
    @Override
    public String printString(String s, Current current) {
        return s + " - returned by code";
    }
}
