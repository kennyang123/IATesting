package com.kenny.testng;

import org.testng.annotations.Test;

/**
 * test2依赖test1
 * 当test1失败的时候，test2不执行
 * 当test1成功时候，test1和test2都执行
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
