package com.example.basic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Map.Entry;

//347. Top K Frequent Elements
public class Problem347 {
    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>() ;
    PriorityQueue<Value> q = new PriorityQueue<Value>(10,new Comparator<Value>() {

        @Override
        public int compare(Value o1, Value o2) {
            if(o1.freq > o2.freq) return -1 ;
            else if(o1.freq < o2.freq) return 1;
            else  return 0;
        }  
    });
    static class Value {
        int val ;
        int freq;

        public Value(int v , int f) {
            this.val = v;
            this.freq = f;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        for(int n : nums) {
            Integer i = h.get(n);
            if(i != null) {
                h.put(n,i.intValue() + 1);
            }
            else {
                h.put(n,1);
            }
        }
        Iterator<Entry<Integer,Integer>> hi = h.entrySet().iterator();
        while(hi.hasNext()) {
            Entry<Integer,Integer> e = hi.next();
            Value v = new Value(e.getKey(),e.getValue());
            q.add(v);
        }
        for ( int j = 0 ; j < k ; j++) {
           result[j] = q.remove().val;  
        }

        return result ;
    }
       
        
}
