package com.kenny.testng.extentReport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodDemo {
    @Test
    public void test1(){
        System.out.println("这是test1执行！");
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        System.out.println("这是test1执行！");
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        System.out.println("这是test1执行！");
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("这是我的自己的日志");
        throw new RuntimeException("这是运行时异常");
    }
}
