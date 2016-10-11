package com.company.polymorphism.calculator;


public class Division implements Operation {
    @Override
    public int calculate(int first, int second) {
        return first/second;
    }
}
