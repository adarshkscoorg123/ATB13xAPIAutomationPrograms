package com.thetestingacademy.ex_05_TestNG_Examples;

import org.testng.annotations.Test;

public class APITesting016_TestNG_Priority_example2 {

    @Test(priority = 0)
    public void test_t1(){
        System.out.println("1");
    }

    @Test(priority = -1)
    public void test_t2(){
        System.out.println("3");
    }

    @Test(priority = -3)
    public void test_t3(){
        System.out.println("2");
    }

    @Test(priority = -5)
    public void test_t4(){
        System.out.println("4");
    }

    @Test(priority = 1)
    public void test_t5(){
        System.out.println("5");
    }

    @Test(priority = 2)
    public void test_t6(){
        System.out.println("6");
    }

}
