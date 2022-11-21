package com.example.basic.sliding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem1358Test {
    @Test
    public void test0() {
        Problem1358 p = new Problem1358();
        int actual = p.numberOfSubstrings("abc");
        Assertions.assertEquals(1,actual);
    }
    @Test
    public void test1() {
        Problem1358 p = new Problem1358();
        int actual = p.numberOfSubstrings("abcabc");
        Assertions.assertEquals(10,actual);
    }

    @Test
    public void test2() {
        Problem1358 p = new Problem1358();
        int actual = p.numberOfSubstrings("aaaaa");
        Assertions.assertEquals(0,actual);
    }

    @Test
    public void test3() {
        Problem1358 p = new Problem1358();
        int actual = p.numberOfSubstrings("aaaaabbbbb");
        Assertions.assertEquals(0,actual);
    }

    
    @Test
    public void test4() {
        Problem1358 p = new Problem1358();
        int actual = p.numberOfSubstrings("abcabcabc");
        Assertions.assertEquals(28,actual);
    }

    @Test
    public void test5() {
        Problem1358 p = new Problem1358();
        int actual = p.numberOfSubstrings("abcabcabcabc");
        Assertions.assertEquals(55,actual);
    }

    @Test
    public void test6() {
        Problem1358 p = new Problem1358();
        int actual = p.numberOfSubstrings("abbc");
        Assertions.assertEquals(1,actual);
    }
}
