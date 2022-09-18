package com.example.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class problem3Test {    
    @Test
    void testCase_1() {  
        Problem3 p = new Problem3();
        String s = "abcabcbb";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(3,pattern);
    }

    @Test
    void testCase_2() {  
        Problem3 p = new Problem3();
        String s = "bbbbb";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(1,pattern);
    }

    @Test
    void testCase_3() {  
        Problem3 p = new Problem3();
        String s = "pwwkew";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(3,pattern);
    }

    @Test
    void testCase_4() {  
        Problem3 p = new Problem3();
        String s = " ";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(1,pattern);
    }

    @Test
    void testCase_5() {  
        Problem3 p = new Problem3();
        String s = "b";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(1,pattern);
    }

    @Test
    void testCase_6() {  
        Problem3 p = new Problem3();
        String s = "dvdf";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(3,pattern);
    }

    
}
