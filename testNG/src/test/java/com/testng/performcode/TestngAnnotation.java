package com.testng.performcode;


import org.testng.annotations.*;
public class TestngAnnotation {
    /**
     * 测试用例1
     */
    @Test
    public void testCase1(){
        System.out.println("in test case 1");
    }

    /**
     * 测试用例2
     */
    @Test
    public void testCase2(){
        System.out.println("in test case 2");
    }

    @BeforeMethod  //在case之前执行
    public void beforeMethod(){
        System.out.println("in beforeMethod");
    }

    @AfterMethod  //在case之后执行
    public void aftermethod(){
        System.out.println("in aftermethod");
    }

    @BeforeClass  //执行一次
    public void beforeclass(){
        System.out.println("in beforeclass");
    }

    @AfterClass  //执行一次
    public void afterclass(){
        System.out.println("in afterclass");
    }

    @BeforeSuite //最先执行,并且只执行一次
    public void beforesuite(){
        System.out.println("in beforesuite");
    }

    @AfterSuite  //最后执行,并且只执行一次
    public void aftersuite(){
        System.out.println("in aftersuite");
    }
}

//    in beforesuite
//    in beforeclass
//    in beforeMethod
//    in test case 1
//        in aftermethod
//        in beforeMethod
//        in test case 2
//        in aftermethod
//        in afterclass
//        in aftersuite