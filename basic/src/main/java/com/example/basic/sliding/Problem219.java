package com.example.basic.sliding;

import java.util.HashSet;

public class Problem219 {
    HashSet<Integer> h = new HashSet<Integer>();
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        for (int i = 0 ; i < nums.length ; i++) {
            if( h.contains(nums[i])) {
                return true;
            }
            else {
               h.add(nums[i]);
               if ( i -k >= 0)
                  h.remove(nums[i-k]);
            }
        }
        return result ;
    }
    
}
