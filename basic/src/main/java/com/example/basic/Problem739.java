package com.example.basic;
import java.util.Stack;
public class Problem739 {
    Stack<Value> st = new Stack<Value>();
    static class Value {
        int val;
        int index;
        public Value(int val,int index) {
           this.val = val ;
           this.index = index;
        }
    }


    public int[] dailyTemperatures(int[] temperatures) {
        int [] temp = new int[temperatures.length];
        for(int i=0 ; i < temperatures.length ; i++) {
            int d = temperatures[i];
            while(!st.empty() && st.peek().val < d) {
                Value val =  st.pop();
                temp[val.index] = i - val.index;
            }
            st.push(new Value(d,i));
        }
        while(!st.empty()){
            Value val = st.pop();
            temp[val.index] = 0;
        }
        return temp ;
    }

}