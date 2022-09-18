package com.example.basic;

import java.util.ArrayDeque;
import java.util.Deque;

public class Trie {
    private static final int R = 256;  
    private Node root;      // root of trie
    private int n;          // number of keys in trie  
    int i = 0;
    private static class Node {
        private Object val;
        private Node[] next = new Node[R];
    }
     /**
     * Initializes an empty string symbol table.
     */
    public Trie() {
    }
    /**
     * Returns the value associated with the given key.
     * @param key the key
     * @return the value associated with the given key if the key is in the symbol table
     *     and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public String get(String key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        Node x = get(root, key, 0);
        if (x == null) return null;
        return (String) x.val;
    }

    
    private Node get(Node x, String key, int d) {
        if (x == null) return null;
        if (d == key.length()) return x;
        char c = key.charAt(d);
        return get(x.next[c], key, d+1);
    }

    public void insert(String word) {
        put (word,String.valueOf(i));
        i++;  
    }

     /**
     * Inserts the key-value pair into the symbol table, overwriting the old value
     * with the new value if the key is already in the symbol table.
     * If the value is {@code null}, this effectively deletes the key from the symbol table.
     * @param key the key
     * @param val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(String key, String val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        if (val == null) delete(key);
        else root = put(root, key, val, 0);
    }

    private Node put(Node x, String key, String  val, int d) {
        if (x == null) x = new Node();
        if (d == key.length()) {
            if (x.val == null) n++;
            x.val = val;
            return x;
        }
        char c = key.charAt(d);
        x.next[c] = put(x.next[c], key, val, d+1);
        return x;
    }

      /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return n;
    }
  
    /**
     * Returns all of the keys in the set that start with {@code prefix}.
     * @param prefix the prefix
     * @return all of the keys in the set that start with {@code prefix},
     *     as an iterable
     */
    public boolean startsWith(String prefix) {
        StringBuffer results = new StringBuffer();
        Node x = get(root, prefix, 0);
        collect(x, new StringBuilder(prefix), results);
        return results.length() > 0 ? true : false;
    }

        /**
     * Returns all of the keys in the symbol table that match {@code pattern},
     * where the character '.' is interpreted as a wildcard character.
     * @param pattern the pattern
     * @return all of the keys in the symbol table that match {@code pattern},
     *     as an iterable, where . is treated as a wildcard character.
     */
    public StringBuffer  keysThatMatch(String pattern) {
        //Deque<String> results = new ArrayDeque<String>();
        StringBuffer results = new StringBuffer();
        collect(root, new StringBuilder(), pattern, results);
        return results;
    }
    private void collect(Node x, StringBuilder prefix, String pattern, StringBuffer results) {
        if (x == null) return;
        if (results.length() > 0) return ;
        int d = prefix.length();
        if (d == pattern.length() && x.val != null) {
            results.append(prefix.toString());
            return;
        }
        if (d == pattern.length())
            return;
      
        char c = pattern.charAt(d);
        if (c == '.') {
            for (char ch = 0; ch < R; ch++) {
                prefix.append(ch);
                collect(x.next[ch], prefix, pattern, results);
                prefix.deleteCharAt(prefix.length() - 1);
            }
        }
        else {
            prefix.append(c);
            collect(x.next[c], prefix, pattern, results);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    public boolean search(String word) {
        StringBuffer q = keysThatMatch(word);
        return q.length() > 0 ? true : false;
    }

    private void collect(Node x, StringBuilder prefix, StringBuffer results) {
        if (x == null) return;
        if(results.length() > 0 ) return;
        if (x.val != null) {
            results.append(prefix.toString());
            return;
        }
     
        for (char c = 0; c < R; c++) {
            prefix.append(c);
            collect(x.next[c], prefix, results);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }
  
    /**
     * Removes the key from the set if the key is present.
     * @param key the key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void delete(String key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        root = delete(root, key, 0);
    }

    private Node delete(Node x, String key, int d) {
        if (x == null) return null;
        if (d == key.length()) {
            if (x.val != null) n--;
            x.val = null;
        }
        else {
            char c = key.charAt(d);
            x.next[c] = delete(x.next[c], key, d+1);
        }

        // remove subtrie rooted at x if it is completely empty
        if (x.val != null) return x;
        for (int c = 0; c < R; c++)
            if (x.next[c] != null)
                return x;
        return null;
    }
}
