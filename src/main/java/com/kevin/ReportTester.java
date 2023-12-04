package com.kevin;

import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report finance = new FinancialReport();
        Report health = new HealthReport();
        List<Report> reports = List.of(finance, health);
        for(Report report : reports) {
            report.load();
            report.print();
        }
    }
}
