package com.example.basic.heap;

import java.util.Arrays;

public class Problem2357 {
    public int minimumOperations(int[] nums) {
        int ops = 0 ;
        Arrays.sort(nums);
        int max = 0;
       
        for(int n : nums) {
            if ( n  == 0) continue;
            else {
                if ( n > max ) {
                    ops++;
                    max = n;
                }
            }

        }
        return ops ;
        
    }
    
}
