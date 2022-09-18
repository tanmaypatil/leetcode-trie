package com.example.basic;

public class Program {

    public void modify ( StringBuffer a) {
        String str = "hello";
        a.append(str);
    }
    public static void main (String[] args ){
        StringBuffer s = new StringBuffer();
        Program p = new Program();
        System.out.println("original "+s.toString() + " length "+s.length());
        p.modify(s);
        System.out.println("modified "+s.toString() + " length " +s.length());

    }
    
}
