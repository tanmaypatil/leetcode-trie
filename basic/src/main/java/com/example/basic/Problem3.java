package com.example.basic;

import java.util.HashSet;

public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null)
            return 0;
        int pattern = 0;
        HashSet<String> h = new HashSet<String>();
        for (char a : s.toCharArray()) {
            // repeating char has found
            if (h.size() > 0 && h.contains(String.valueOf(a))) {
                if (h.size() > pattern) {
                    pattern = h.size();
                }
                h.remove(String.valueOf(a));
            }
            h.add(String.valueOf(a));
        }
        if(h.size() > pattern) {
            pattern = h.size();
        }
        return pattern;
    }
}
