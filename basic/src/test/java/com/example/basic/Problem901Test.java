package com.example.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Problem901Test {

    @Test
    void testApp4() {
        Problem901 p = new Problem901();
        int actual = p.next(100);
        assertEquals(1, actual);
        actual = p.next(80);  // return 1
        assertEquals(1, actual);
        actual = p.next(60);  // return 1
        assertEquals(1, actual);
        actual = p.next(70);  // return 2
        assertEquals(2, actual);
        actual = p.next(60);  // return 1
        assertEquals(1, actual);
        actual = p.next(75);
        assertEquals(4, actual);
        actual = p.next(85);
        assertEquals(6, actual);

        
    }

    @Test
    void testApp5() {
        Problem901 p = new Problem901();
        int actual = p.next(100);
        assertEquals(1, actual);
        actual = p.next(200);  
        assertEquals(2, actual);
        actual = p.next(300);  // return 1
        assertEquals(3, actual);
        
    }

    @Test
    void testApp6() {
        Problem901 p = new Problem901();
        int actual = p.next(300);
        assertEquals(1, actual);
        actual = p.next(200);  
        assertEquals(1, actual);
        actual = p.next(100);  // return 1
        assertEquals(1, actual);
        
    }
    
}
