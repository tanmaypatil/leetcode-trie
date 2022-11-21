package com.example.basic;

import java.util.Stack;

public class Problem962 {
     // Stack is often used for problems like
    // find nearest larger/smaller elem (like water container problem)
    // here it's to find furthest larger/smaller elem (a bit harder than water container problme)
    // Time=O(N) Space=O(N)
    public int maxWidthRamp(int[] A) {
        // scanning from left to right to get all possible indices of the min element seen so far
        // think a bit and you'll discover they are valid START INDICES candidates for the widest ramp
        // they are [i0, i1, i2, i3, i4] as in the pic attached, you could use the pic to think on the algorithm
        int N = A.length;
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < N; i++) {
            if (s.isEmpty() || A[i] < A[s.peek()]) {
                s.push(i);
            }
        }
        // now scanning backwards for all other non-min elements, let them pair with all the candidates
        // we've collected in the first step in stack. Meanwhile, if we've discover that the current index i could
        // form a ramp with a min idx j, we know j couldn't form a better solution since i is going backwards
        // so we pop j out of stack
        int res = 0;
        for (int i = N - 1; i >= 0; i--) {
            while (!s.isEmpty() && A[s.peek()] <= A[i]) {
                res = Math.max(res, i - s.pop());
            }      
        }
        return res;
    }
    
}
