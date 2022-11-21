package com.example.basic.heap;

import java.util.ArrayList;
import java.util.Collections;

//41. First Missing Positive
public class Problem41 {
    public Problem41() {
 
}

 public static void main(String[] args) {
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(5);
    x.add(1);
    x.add(10);
    x.add(11);
    Collections.sort(x);
    int a = Collections.binarySearch(x, 1);
    System.out.println("a is "+a);
    a = Collections.binarySearch(x, 5);
    System.out.println("a is "+a);
    a = Collections.binarySearch(x, 12);
    System.out.println("a is "+a);
    a = Collections.binarySearch(x, 9);
    System.out.println("a is "+a);
}
    
}
