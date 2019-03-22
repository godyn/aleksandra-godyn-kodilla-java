package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //GIVEN
        Logger logger = Logger.getInstance();
        logger.log("log in");
        logger.log("password change");
        //WHEN
        String lastLog = logger.getLastLog();
        //THEN
        Assert.assertEquals("password change", lastLog);
    }
}
