package com.example.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Problem11Test {
    @Test
    void testCase_1() { 
        Problem11 p = new Problem11();
        int[] height = { 1,1};
        int w = p.maxArea(height);
        assertEquals(1, w);
    }

    @Test
    void testCase_2() { 
        Problem11 p = new Problem11();
        int[] height = { 1,8,6,2,5,4,8,3,7};
        int w = p.maxArea(height);
        assertEquals(49, w);
    }
    
}
