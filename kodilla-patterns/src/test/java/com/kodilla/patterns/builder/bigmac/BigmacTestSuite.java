package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac() {
        //Given
        BigMac bigmac = new BigMac.BigmacBuilder()
                .bun("standard")
                .burgers(2)
                .sauce("1000 wysp")
                .ingredient("cebula")
                .ingredient("ogórek")
                .ingredient("ser")
                .ingredient("sałata")
                .build();
        System.out.println(bigmac);

        BigMac bigmac2 = new BigMac.BigmacBuilder()
                .ingredient("cebula")
                .build();
        System.out.println(bigmac2);

        boolean exceptionHappenedIngredients = false;
        try {
            BigMac bigmac3 = new BigMac.BigmacBuilder()
                    .ingredient("unavailable ingredient -> should throw exception")
                    .build();
        } catch (IllegalStateException ex) {
            exceptionHappenedIngredients = true;
        }

        boolean exceptionHappenedSauce = false;
        try {
            BigMac bigmac4 = new BigMac.BigmacBuilder()
                    .sauce("unavailable sauce -> should throw exception")
                    .build();
        } catch (IllegalStateException ex) {
            exceptionHappenedSauce = true;
        }

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertTrue(bigmac.getIngredients().contains("sałata"));
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertTrue(bigmac.getSauce().contains("1000 wysp"));
        Assert.assertEquals(null, bigmac2.getBun());
        Assert.assertTrue(exceptionHappenedIngredients);
        Assert.assertTrue(exceptionHappenedSauce);
    }
}
