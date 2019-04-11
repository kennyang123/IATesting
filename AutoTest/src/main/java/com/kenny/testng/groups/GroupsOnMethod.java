package com.kenny.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端的测试方法111111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端的测试方法222222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法333333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试方法444444");
    }
    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("这是服务端组之前运行的");
    }
    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("这是服务端组之后运行的");
    }
    @BeforeGroups("client")
    public void beforeGroupOnCient(){
        System.out.println("这是客户端组之前运行的");
    }
    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("这是客户端组之后运行的");
    }
}
