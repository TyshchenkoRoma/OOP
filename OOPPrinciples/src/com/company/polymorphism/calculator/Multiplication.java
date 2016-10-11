package com.company.polymorphism.calculator;


public class Multiplication implements Operation{
    @Override
    public int calculate(int first, int second) {
        return first*second;
    }
}
