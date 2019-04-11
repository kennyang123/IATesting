package com.kenny.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name=" + name + " age=" + age);
    }
    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        Object[][] o = new Object[][]{
                {"张珊",10},
                {"李四",20},
                {"王五",30}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public  void test1(String name,int age){
        System.out.println("test1:name=" + name + " age=" + age);
    }
    @Test(dataProvider = "methodData")
    public  void test2(String name,int age){
        System.out.println("test2:name=" + name + " age=" + age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] o = null;
        if(method.getName().equals("test1")){
            o = new Object[][]{
                    {"张1",21},
                    {"李1",22}
            };
        }else if(method.getName().equals("test2")){
            o = new Object[][]{
                    {"杨2",31},
                    {"赵2",32}
            };
        }
        return o;
    }
}
