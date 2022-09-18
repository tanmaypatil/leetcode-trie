package com.example.basic;

import java.util.ArrayList;

public class RepeatSequence {
    public int lengthOfLongestSubstring(String s) {
        int pattern = 0 ;
        ArrayList<String> arr = new ArrayList<String> ();
        for (char c : s.toCharArray()){
            String t = String.valueOf(c);
            int i = arr.indexOf(t);
            if ( i != -1 ) {
                pattern = pattern > arr.size() ? pattern  : arr.size();
                arr.subList(0,i+1).clear();
            }
            arr.add(String.valueOf(t));
        }
        return (arr.size()> pattern ? arr.size() : pattern) ;
    }
    
}
