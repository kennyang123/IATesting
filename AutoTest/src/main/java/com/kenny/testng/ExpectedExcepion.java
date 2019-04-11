package com.kenny.testng;

import org.testng.annotations.Test;

public class ExpectedExcepion {
    /**
     * 什么时候用到异常测试
     * 在我们期望结果为某个异常的时候
     *
     */
    //这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException1(){
        System.out.println("这是一个失败的异常测试");

    }
    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException2(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
