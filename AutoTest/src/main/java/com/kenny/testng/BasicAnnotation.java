package com.kenny.testng;


import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("Test:这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test:这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod:这是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod:这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass:这是在类之前执行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass:这是在类之后执行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite:这是测试套件之前执行的");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite:这是测试套件之后执行的");
    }
}
