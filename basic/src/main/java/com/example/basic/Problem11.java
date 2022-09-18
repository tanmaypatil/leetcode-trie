package com.example.basic;

// container with Most water.
public class Problem11 {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int d = 0;
        int maxw = 0;
        int x = 0;
        while (i < j) {
            d = j - i ;
            int w = (height[i] >= height[j] ?   height[j] :  height[i]   ) * d;
            maxw = w > maxw ? w : maxw;
            System.out.println( " i : " +i + " j : "+j);
            System.out.println( " height[i] : " +height[i] + " height[j] : "+height[j]);
            System.out.println("w : "+w + " maxw "+maxw );
            x++;
            if ( x % 2 == 0) 
                i++;
            else 
                j--;
        }
        return maxw;
    }

}
