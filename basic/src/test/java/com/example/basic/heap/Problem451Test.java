package com.example.basic.heap;

import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Problem451Test {
    @Test
    public void test1() {
        Problem451 p = new Problem451();
        String actual = p.frequencySort("tree");
        assertThat(actual).isIn("eert","eetr");


    }
}
