package com.example.basic;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

public class DateTest {

    @Test 
    public void test1() throws Exception {
        DateCheck d = new DateCheck();
        Timestamp t = d.validateAndFormat("20220512", "yyyyMMdd");
        System.out.println("date : " + t.toString());
    }
    
    @Test 
    public void test2() throws Exception {
        DateCheck d = new DateCheck();
        Timestamp t = d.validateAndFormat("     ", "yyyyMMdd");
        System.out.println("date : " + t.toString());
    }

    @Test 
    public void test3() throws Exception {
        DateCheck d = new DateCheck();
        Timestamp t = d.validateAndFormatLenient("000000", "yyyyMMdd");
        System.out.println("date : " + t.toString());
    }

    @Test 
    public void test4() throws Exception {
        DateCheck d = new DateCheck();
        Timestamp t = d.validateAndFormatLenient("2000 202", "yyyyMMdd");
        System.out.println("date : " + t.toString());
    }

    @Test 
    public void test5() throws Exception {
        DateCheck d = new DateCheck();
        Timestamp t = d.validateAndFormat("2000 202", "yyyyMMdd");
        System.out.println("date : " + t.toString());
    }
}

