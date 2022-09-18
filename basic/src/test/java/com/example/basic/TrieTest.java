package com.example.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrieTest {
    @Test
    void testCase_4() {  
        TrieST<Integer> st = new TrieST<Integer>();
        st.put("short",1);
        st.put("shortest",2);
        st.put("tallest",3);
        st.put("tall",4);
        Iterable<String> it = st.keysWithPrefix("short");
        ArrayList<String> fl = new ArrayList<String>();
        for(String s : it) {
            System.out.println("s :"+s);
            fl.add(s);
        }
        Assertions.assertEquals(2, fl.size());

    }

    @Test
    void testcase_5() {
            TrieST<Integer> st = new TrieST<Integer>();
            st.put("short",1);
            st.put("shortest",2);
            st.put("shortman",9);
            st.put("shorter",5);
            st.put("tallest",3);
            st.put("tall",4);
            String s = st.longestPrefixOf("shortest man");
            Assertions.assertEquals("shortest", s);
    }
    
}
