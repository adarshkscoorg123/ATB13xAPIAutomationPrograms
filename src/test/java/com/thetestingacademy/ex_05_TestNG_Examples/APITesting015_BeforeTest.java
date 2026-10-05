package com.thetestingacademy.ex_05_TestNG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting015_BeforeTest {

    // PUT Request
    // 1. getToken
    // 2. getBookingId
    // 3. test_PUT ( which will use the above two methods)
    // 4. closeAllThings

    @BeforeTest
    public void getToken(){
        System.out.println("Before GET token");
    }

    @BeforeTest // It will run based on Method name(here all the methods starts with get,
    // but it will execute getAddy(since it will consider the alphabet "A"
    public void getAddy(){
        System.out.println("Sample test case");
    }

    @BeforeTest
    public void getBookingID(){
        System.out.println("Before GET BOOKING");
    }

    @Test
    public void test_PUT(){
        // token and BookingID
        System.out.println("PUT REQUEST");
    }

    @AfterTest
    public void closeAllThings(){
        System.out.println("Close");
    }

}
