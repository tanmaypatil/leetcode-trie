package com.example.basic;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem503Test {
    @Test
    void testApp1() {
        Problem503 p = new Problem503();
        int[] nums1 = {1,2,1 };
      
        int[] nums3 = p.nextGreaterElements(nums1);
        int[] expected = {2,-1,2} ;
        System.out.println("output "+Arrays.toString(nums3));
        Assertions.assertArrayEquals(expected, nums3);

    }

    @Test
    void testApp2() {
        Problem503 p = new Problem503();
        int[] nums1 = {1,2,3,4,3 };
      
        int[] nums3 = p.nextGreaterElements(nums1);
        int[] actual = {2,3,4,-1,4} ;
        Assertions.assertArrayEquals(nums3, actual);


    }

    
    @Test
    void testApp3() {
        Problem503 p = new Problem503();
        int[] nums1 = {1,2,5,4,3 };
      
        int[] nums3 = p.nextGreaterElements(nums1);
        int[] actual = {2,5,-1,5,5} ;
        System.out.println(" values" +Arrays.toString(nums3));
        Assertions.assertArrayEquals(nums3, actual);


    }
    
    // Expected [120,11,120,120,123,123,-1,100,100,100]
    @Test
    void testApp4() {
        Problem503 p = new Problem503();
        int[] nums1 = {100,1,11,1,120,111,123,1,-1,-100};
      
        int[] nums3 = p.nextGreaterElements(nums1);
        int[] actual = {120,11,120,120,123,123,-1,100,100,100} ;
        System.out.println(" values" +Arrays.toString(nums3));
        Assertions.assertArrayEquals(actual, nums3);


    }
}
