package com.kevin;

public class FinancialReport implements Report{
    @Override
    public void load() {
        System.out.println("Load financial data");
    }

    @Override
    public void print() {
        System.out.println("Print financial data");
    }
}
