package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testAddLog(){
        //Given
        Logger logger = Logger.getInstance();

        //When
        String newLogLine = "new log line";
        logger.log(newLogLine);

        //Then
        Assert.assertEquals(newLogLine, logger.getLastLog());
    }

}