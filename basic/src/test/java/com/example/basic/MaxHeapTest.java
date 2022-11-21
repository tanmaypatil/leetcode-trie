package com.example.basic;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class MaxHeapTest {
    @Test
    public void test1() {
        MaxHeap h = new MaxHeap(10);
        h.add(5);
        h.add(10);
        h.add(11);
        ArrayList<Integer> a = h.path(0);
        System.out.println("path "+a.toString());

    }
}
