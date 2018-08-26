package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] numbers = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        Assert.assertEquals(3, ArrayOperations.getAverage(numbers), 0.0001);

        numbers = new int[]{0, 3, 6, 7, 12, 13, 1, 0, 12, 6, 5, 14, 17, 18, 3, 2, 1, -1, 0, -33};
        Assert.assertEquals(4.3, ArrayOperations.getAverage(numbers), 0.0001);

        numbers = new int[]{-11, -32, 27};
        Assert.assertEquals(-5.3333333, ArrayOperations.getAverage(numbers), 0.0001);
    }

}
