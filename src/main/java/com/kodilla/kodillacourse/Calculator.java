package com.kodilla.kodillacourse;

public class Calculator {

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return b - a;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int sumResult = calculator.addAToB(5, 17);

        System.out.println(sumResult);
    }
    }
