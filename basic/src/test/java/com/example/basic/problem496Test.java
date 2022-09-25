package com.example.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class problem496Test {
    @Test
    void testApp() {
        Problem496 p = new Problem496();
        int[] nums1 = { 4,1,2};
        int[] nums2 = { 1,3,4,2};
        int[] nums3 = p.nextGreaterElement(nums1, nums2);
        int[] actual = {-1,3,-1} ;
        Assertions.assertArrayEquals(nums3, actual);
    }
    @Test
    void testApp1() {
        Problem496 p = new Problem496();
        int[] nums1 = {6,2 };
        int[] nums2 = { 1,6,5,4,3,2,7};
        int[] nums3 = p.nextGreaterElement(nums1, nums2);
        int[] actual = {7,7} ;
        Assertions.assertArrayEquals(nums3, actual);


    }
    @Test
    void testApp2() {
        Problem496 p = new Problem496();
        int[] nums1 = {2,4 };
        int[] nums2 = { 1,2,3,4};
        int[] nums3 = p.nextGreaterElement(nums1, nums2);
        int[] actual = {3,-1} ;
        Assertions.assertArrayEquals(nums3, actual);


    }
    
}
