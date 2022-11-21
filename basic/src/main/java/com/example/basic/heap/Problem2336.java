package com.example.basic.heap;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Problem2336 {
   HashSet<Integer> h = new HashSet<Integer>();
   int smallest = 1;
    public Problem2336() {
        
    }
    
    public int popSmallest() {
        int next = smallest + 1;
        int ret = smallest;
        while(h.contains(next)) {
           next += 1;
        }
        h.add(smallest);
        smallest = next;
        return ret;   
    }
    
    public void addBack(int num) {
        if(h.contains(num)) {
            h.remove(num);
        }
        
    }
}
