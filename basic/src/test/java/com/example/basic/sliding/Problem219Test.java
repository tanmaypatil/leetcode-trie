package com.example.basic.sliding;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Problem219Test {
    @Test
    public void test1() {
        Problem219 p = new Problem219();
        boolean actual = p.containsNearbyDuplicate(new int[]{1,2,3,1}, 3);
        Assertions.assertEquals(true, actual);
    }

    @Test
    public void test2() {
        Problem219 p = new Problem219();
        boolean actual = p.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2);
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void test3() {
        Problem219 p = new Problem219();
        boolean actual = p.containsNearbyDuplicate(new int[]{1,0,1,1}, 1);
        Assertions.assertEquals(true, actual);
    }

}
