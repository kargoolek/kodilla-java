package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calc = context.getBean(Calculator.class);

        double a = 21, b = 6;

        //When
        double resAdd = calc.add(a, b);
        double resSub = calc.sub(a, b);
        double resMul = calc.mul(a, b);
        double resDiv = calc.div(a, b);

        //Then
        Assert.assertEquals(a+b, resAdd, 0.00001);
        Assert.assertEquals(a-b, resSub, 0.00001);
        Assert.assertEquals(a*b, resMul, 0.00001);
        Assert.assertEquals(a/b, resDiv, 0.00001);
    }
}
