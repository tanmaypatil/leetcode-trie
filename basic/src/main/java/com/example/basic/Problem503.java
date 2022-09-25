package com.example.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

//503. Next Greater Element II
public class Problem503 {
    static class Value {
        public int index;
        public int val;

        public Value(int index, int val) {
            this.index = index;
            this.val = val;
        }

    };

    public int[] nextGreaterElements(int[] nums) {
        int[] ret = new int[nums.length];
        Arrays.fill(ret, -1);
        Stack<Value> s = new Stack<Value>();

        for (int l = 0; l < 2; l++) {
            for (int i = 0; i < nums.length - l; i++) {
                int n = nums[i];
                while (!s.empty() && s.peek().val < n) {
                    Value a = s.pop();
                    if (ret[a.index] == -1) {
                        ret[a.index] = n;
                    }
                }
                s.push(new Value(i, n));
            }
        }

        return ret;
    }

}
