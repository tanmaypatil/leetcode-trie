package com.example.basic.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map.Entry;

import java.util.Iterator;

//192. Word Frequency
public class Problem451 {
    static class Value {
        String ch ;
        int freq;

        public Value(String ch , int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    };
    HashMap<String ,Integer> h = new HashMap<String,Integer> () ;
    PriorityQueue<Value> q = new PriorityQueue<>(10,new Comparator<Value>() {
        @Override
        public int compare(Value o1, Value o2) {
           if(o1.freq > o2.freq) return -1;
           else if ( o1.freq < o2.freq) return 1;
           else if ( o1.ch.compareTo(o2.ch) > 0 )  {
            return -1;
           }
           else if (o1.ch.compareTo(o2.ch) > 0 ) {
            return 1;
           }
           else return 0;
        }
        
    });
    public String frequencySort(String s) {
        
        for(int i = 0 ; i < s.length() ; i++){
            String c = String.valueOf(s.charAt(i));
            Integer j =  h.get(c);
            if ( j == null) {
                h.put(c,1);
            }
            else {
                h.put(c,j.intValue() + 1);
            }
        }

        Iterator<Entry<String,Integer>> e = h.entrySet().iterator();
        while(e.hasNext()){
            Entry<String,Integer> a = e.next();
            q.add( new Value ( a.getKey(),a.getValue()));
        }
        StringBuffer sb = new StringBuffer();
        while(q.size() > 0) {
            Value v = q.remove();
            for(int i = 0 ; i < v.freq; i++ ) {
                sb.append(v.ch);
            }
        }

        return sb.toString();
        
        
    }
    
}
