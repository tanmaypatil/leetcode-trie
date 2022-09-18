package com.example.basic;

public class MaxWater {
    public int maxAreaOld(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int d = 0;
        int maxw = 0;
        while (i < height.length -1) {
            j = i + 1;
            while (j < height.length ) {
                d = j - i;
                int w = (height[i] > height[j] ? height[j] : height[i]) * d;
                maxw = maxw > w ? maxw : w;
                System.out.println(" i : " + i + " j : " + j);
                System.out.println(" height[i] : " + height[i] + " height[j] : " + height[j]);
                System.out.println("w : " + w + " maxw " + maxw);
                j++;
            }
            i++;
        }
        return maxw;
    }

    public int maxArea(int[] height) {
        int maxarea = 0;
        int left = 0; 
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }

}
