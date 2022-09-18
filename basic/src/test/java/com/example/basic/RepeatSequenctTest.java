package com.example.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RepeatSequenctTest {
    @Test
    void testCase_1() {  
        RepeatSequence p = new RepeatSequence();
        String s = "abcabcbb";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(3,pattern);
    }

    @Test
    void testCase_2() {  
        RepeatSequence p = new RepeatSequence();
        String s = "bbbbb";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(1,pattern);
    }

    @Test
    void testCase_3() {  
        RepeatSequence p = new RepeatSequence();
        String s = "pwwkew";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(3,pattern);
    }

    @Test
    void testCase_4() {  
        RepeatSequence p = new RepeatSequence();
        String s = " ";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(1,pattern);
    }

    @Test
    void testCase_5() {  
        RepeatSequence p = new RepeatSequence();
        String s = "b";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(1,pattern);
    }

    @Test
    void testCase_6() {  
        RepeatSequence p = new RepeatSequence();
        String s = "dvdf";
        int pattern = p.lengthOfLongestSubstring(s);
        assertEquals(3,pattern);
    }


    
}
