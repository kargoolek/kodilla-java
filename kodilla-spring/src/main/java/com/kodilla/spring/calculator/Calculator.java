package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    Display display;

    public double add(double a, double b) {
        double res = a + b;
        display.displayValue(res);
        System.out.println("calculation: " + a + " + " + b + " = " + res);
        return res;
    }

    public double sub(double a, double b) {
        double res = a - b;
        display.displayValue(res);
        System.out.println("calculation: " + a + " - " + b + " = " + res);
        return res;
    }

    public double mul(double a, double b) {
        double res = a * b;
        display.displayValue(res);
        System.out.println("calculation: " + a + " * " + b + " = " + res);
        return res;
    }

    public double div(double a, double b){
        double res = a / b;
        display.displayValue(res);
        System.out.println("calculation: " + a + " / " + b + " = " + res);
        return res;
    }
}
