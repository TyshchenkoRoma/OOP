package com.company.polymorphism.calculator;


public class Addition implements Operation {
    @Override
    public int calculate(int first, int second) {
        return first + second;
    }
}
