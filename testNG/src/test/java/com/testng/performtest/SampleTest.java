package com.testng.performtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class SampleTest {
    String message = "hello world";

    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        Assert.assertEquals(message,messageUtil.pringMessage());
    }
}
