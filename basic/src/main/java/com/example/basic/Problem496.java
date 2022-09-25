package com.example.basic;

import java.util.Stack;
import java.util.HashMap;

/*
 * Inspired by https://blog.yujinyan.me/leetcode/monotonic-stack/
 */
public class Problem496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = null;
        Stack<Integer> s = new Stack<Integer>();
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for ( int n : nums2) {
            while(!s.empty() && s.peek() < n){
                Integer a = s.pop();
                h.put(a,n);
            }
            s.push(n);
        }

        result = new int[nums1.length];
        for ( int i = 0 ; i < nums1.length; i++) {
            result[i] = h.get(nums1[i]) != null ?  h.get(nums1[i]) : -1;
        }
        return result;

        
    }


}
