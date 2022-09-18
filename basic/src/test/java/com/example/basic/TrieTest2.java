package com.example.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrieTest2 {
    @Test
    void testcase_5() {
        Trie trie = new Trie();
        trie.insert("apple");
        boolean b = trie.search("apple"); 
        Assertions.assertEquals(true, b);
        b = trie.search("app");     // return False
        Assertions.assertEquals(false, b);
    }
    @Test
    void testcase_6() {
        Trie trie = new Trie();
        trie.insert("apple");
        boolean b = trie.search("apple"); 
        Assertions.assertEquals(true, b);
        b = trie.search("app");     // return False
        Assertions.assertEquals(false, b);
        b = trie.startsWith("app"); // return True
        Assertions.assertEquals(true, b);
        trie.insert("app");
        b = trie.search("app");   
        Assertions.assertEquals(true, b);
    }
    
}
