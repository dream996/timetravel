package com.testng.suitetest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
    String message="Manisha";

    MessageUtil messageUtil=new MessageUtil(message);

    @Test
    public void testPringMessage(){
        System.out.println("Inside testPringMessage()");
        Assert.assertEquals(message,messageUtil.pringMessage());
    }
}
