package com.example.basic;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem347Test {

    @Test 
    public void test1() {
        Problem347 p = new Problem347();
        int[] actual = p.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(new int[] {1,2}, actual);

    }

    
    @Test 
    public void test2() {
        Problem347 p = new Problem347();
        int[] actual = p.topKFrequent(new int[]{1,1,1,3,2,3}, 2);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(new int[] {1,3}, actual);

    }

    @Test 
    public void test4() {
        Problem347 p = new Problem347();
        int[] actual = p.topKFrequent(new int[]{1,1,1,3,2,3,1,5,5,5,5,5,5,5,5,5,5,5}, 2);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(new int[] {1,5}, actual);

    }
    

    
}
