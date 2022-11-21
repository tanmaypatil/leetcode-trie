package com.example.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem703Test {

    @Test
    public void test1() {
    Problem703 kthLargest = new Problem703(3, new int[]{4, 5, 8, 2});
int actual = kthLargest.add(3);   // return 4
Assertions.assertEquals(4, actual);
kthLargest.add(5);   // return 5
kthLargest.add(10);  // return 5
kthLargest.add(9);   // return 8
kthLargest.add(4);   // return 8
    }
    


@Test 
public void test2() {
    Problem703 kthLargest = new Problem703(1, new int[]{});
    int actual = kthLargest.add(-3);  
    Assertions.assertEquals(-3, actual) ;
    actual = kthLargest.add(-2);  
Assertions.assertEquals(-2, actual) ;
actual = kthLargest.add(-4);  
Assertions.assertEquals(-2, actual) ; 
actual = kthLargest.add(0);
Assertions.assertEquals(0, actual) ; 
actual = kthLargest.add(4);
Assertions.assertEquals(4, actual) ; 


  
}
}