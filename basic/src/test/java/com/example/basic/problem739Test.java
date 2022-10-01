package com.example.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class problem739Test {
    @Test
    void testApp() {  
        Problem739 p = new Problem739();
        // [73,74,75,71,69,72,76,73]
        int [] temperatures = {73,74,75,71,69,72,76,73};
        int [] expected = {1,1,4,2,1,1,0,0};
        int[] actual = p.dailyTemperatures(temperatures);
        Assertions.assertArrayEquals(expected, actual); 
    }
    //[30,40,50,60]
    @Test
    void testApp1() {  
        Problem739 p = new Problem739();
        // [73,74,75,71,69,72,76,73]
        int [] temperatures = {30,40,50,60};
        int [] expected = {1,1,1,0};
        int[] actual = p.dailyTemperatures(temperatures);
        Assertions.assertArrayEquals(expected, actual);
      
    }

    @Test
    void testApp2() {  
        Problem739 p = new Problem739();
        // [73,74,75,71,69,72,76,73]
        int [] temperatures = {30,60,90};
        int [] expected = {1,1,0};
        int[] actual = p.dailyTemperatures(temperatures);
        Assertions.assertArrayEquals(expected, actual);
      
    }

    @Test
    void testApp3() {  
        Problem739 p = new Problem739();
        // [73,74,75,71,69,72,76,73]
        int [] temperatures = {90,60,30};
        int [] expected = {0,0,0};
        int[] actual = p.dailyTemperatures(temperatures);
        Assertions.assertArrayEquals(expected, actual);
      
    }

    @Test
    void testApp4() {  
        Problem739 p = new Problem739();
        // [73,74,75,71,69,72,76,73]
        int [] temperatures = {90,90,90};
        int [] expected = {0,0,0};
        int[] actual = p.dailyTemperatures(temperatures);
        Assertions.assertArrayEquals(expected, actual);
    }
    
}
