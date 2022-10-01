package com.example.basic;

import java.util.Stack;

//901. Online Stock Span
public class Problem901 {
    Stack<Span> st = new Stack<Span>();
    static class Span {
        int price ;
        int span;
        public Span(int val , int span) {
            this.price = val ;
            this.span = span;
        }
    }
    
    public int next(int price) {
        int span = 1 ;
        while (!st.empty() && st.peek().price <= price){
            span += st.pop().span;
        }
        st.push(new Span(price,span));
        return span;
        
    }
    
}
