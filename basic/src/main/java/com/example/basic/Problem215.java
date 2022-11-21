package com.example.basic;

import java.util.PriorityQueue;

public class Problem215 {
    PriorityQueue<Integer> q =new PriorityQueue<Integer>();
    int k = 0;
    public int findKthLargest(int k, int[] nums) {
      this.k = k ;
       for ( int n : nums) {
        q.add(n);
       }
       while ( q.size() > this.k){
         q.remove();
       }
       return q.peek();
        
    }


 
    
}
