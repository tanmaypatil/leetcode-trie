package com.example.basic;

import java.util.ArrayList;

public class Problem66 {
    public int[] plusOne(int[] digits) {
        if ( digits == null) {
            return null;
        }
        int[] output = null;
        ArrayList<Integer> a = new ArrayList<Integer> ();
        int c = 0;
        boolean firstTime = true;
        for (int i = digits.length -1 ; i >= 0 ; i-- ) {
           int y = 0 ;
           if( c + digits[i] + (firstTime == true ? 1 :0 ) == 10 ) {
            y = 0 ; 
            c = 1;
           }
           else {
            y = c + digits[i] + (firstTime == true ? 1 :0 );
            c = 0;
           }
           a.add(y);
           firstTime = false;
        } 
        if ( c == 1) {
            a.add(1);
        }
        System.out.println("a is "+a);  
        output=new int[a.size()];
        int i = a.size() - 1;
        for ( int x : a ){
            output[i--] = x ;
        }
        return output;
    }
        
}

