package com.example.basic.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueTest {
    public static class Value {
        public Value(int i, int j) {
            this.c = i;
            this.p = j;
        }
        int c;
        int p;
    }
   

    public static void  main( String[] argv) {
        Value o1 = new Value(1,1);
        Value o2 = new Value(2,2);
        Value o3 = new Value(2,2);
        PriorityQueue<Value> a = new PriorityQueue<Value>(10,
        new Comparator<Value>() {

            @Override
            public int compare(Value o1, Value o2) {
                // TODO Auto-generated method stub
                if ( o1.c == o2.c ) return 0 ;
                else if ( o1.c < o2.c ) return -1;
                else   return 1;

            }
            
        });
        a.add(o1);
        a.add(o2);
        //System.out.println(" size of priorityQueue a: " + a.size());
        PriorityQueue<Value> b = new PriorityQueue<Value> (a);
        b.clear();
        b.add(o1);
        b.add(o2);
        b.add(o3);
        //System.out.println(" size of priorityQueue b: " + b.size());
        b.remove(o1);
        /* 
        System.out.println("post deletion");
        System.out.println(" size of priorityQueue b: " + b.size());
        System.out.println(" size of priorityQueue a: " + a.size()); */
        PriorityQueue<Integer> p = new PriorityQueue<Integer>() ;
        p.add(10);
        p.add(20);
        p.add(10);
        System.out.println(" 1'st remove " + p.remove());
        System.out.println(" 2'nd remove " + p.remove());
        System.out.println(" 3rd remove " + p.remove());


        return ;

    }
}
