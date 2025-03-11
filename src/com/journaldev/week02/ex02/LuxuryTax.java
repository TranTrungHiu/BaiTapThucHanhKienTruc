package com.journaldev.week02.ex02;

class LuxuryTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return price * 0.20;
    }
}
