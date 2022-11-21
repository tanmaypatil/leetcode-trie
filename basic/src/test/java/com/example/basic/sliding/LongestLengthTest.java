package com.example.basic.sliding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestLengthTest {
    @Test
    public void test1() {
        String s = "AACACAACBBBB";
        LongestLength l = new LongestLength();
        int actual = l.characterReplacement(s, 3);
        Assertions.assertEquals(8,actual);

    }

    @Test
    public void test2() {
        String s = "AACACAACBBBBBB";
        LongestLength l = new LongestLength();
        int actual = l.characterReplacement(s, 3);
        Assertions.assertEquals(9,actual);

    }

}
