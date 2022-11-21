package com.example.basic;

import java.util.PriorityQueue;

public class Problem703 {
    PriorityQueue<Integer> q =new PriorityQueue<Integer>();
    int k = 0;
    public Problem703(int k, int[] nums) {
        this.k = k;
       for ( int n : nums) {
        q.add(n);
       }
       for ( int i = 0 ; i < nums.length - k   ; i++){
         q.remove();
       }
       System.out.println("values : "+q.toString());
        
    }
    
    public int add(int val) {
        int a  =0 ;
        q.add(val);
        if ( q.size() > this.k ) {
           q.remove();
        }
      
        a = q.peek();
       
        return a; 
    }
    
}
