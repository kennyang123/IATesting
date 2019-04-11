package com.kenny.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "techer")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的techer1运行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的techer2运行");
    }
}
