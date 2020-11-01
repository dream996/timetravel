package com.testng.test;

import org.testng.annotations.BeforeSuite;


import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {
    //只运行一次
    @BeforeSuite
    public void testAdd(){
        String str="TestNG is working fine";
        System.out.println("只运行一次");
        assertEquals("TestNG is working fine", str);
    }
}
