package com.thetestingacademy.ex_05_TestNG_Examples.parallel.class_level_cross_browser_Testing;

import org.testng.annotations.Test;

public class FireFoxTest {

    @Test
    public void test_firefox(){
        System.out.println("3");
        System.out.println(Thread.currentThread().getId());
    }
}
