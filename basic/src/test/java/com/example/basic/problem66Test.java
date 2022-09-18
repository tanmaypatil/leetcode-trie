package com.example.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class problem66Test {
    @Test
    void testApp() {  
        Problem66 p = new Problem66();
        int[] e = {1,2,4 };
        int[] digits = { 1,2,3};
        int[] o = p.plusOne(digits);
        System.out.println("output "+Arrays.toString(o));
        boolean a = Arrays.equals(e, o);
        assertEquals(true,a);
    }
@Test
    void testCase_2() {  
        Problem66 p = new Problem66();
        int[] e = {1,0 };
        int[] digits = { 9};
        int[] o = p.plusOne(digits);
        System.out.println("output "+Arrays.toString(o));
        boolean a = Arrays.equals(e, o);
        assertEquals(true,a);
    }

    @Test
    void testCase_3() {  
        Problem66 p = new Problem66();
        int[] e = {4,3,2,2 };
        int[] digits = { 4,3,2,1};
        int[] o = p.plusOne(digits);
        System.out.println("output "+Arrays.toString(o));
        boolean a = Arrays.equals(e, o);
        assertEquals(true,a);
    }

    @Test
    void testCase_4() {  
        Problem66 p = new Problem66();
        int[] e = {1 };
        int[] digits = { 0};
        int[] o = p.plusOne(digits);
        System.out.println("output "+Arrays.toString(o));
        boolean a = Arrays.equals(e, o);
        assertEquals(true,a);
    }
    
}
