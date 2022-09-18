package com.example.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MaxWaterTest {
    @Test
    void testCase_1() { 
        MaxWater p = new MaxWater();
        int[] height = { 1,1};
        int w = p.maxArea(height);
        assertEquals(1, w);
    }

    @Test
    void testCase_2() { 
        MaxWater p = new MaxWater();
        int[] height = { 1,8,6,2,5,4,8,3,7};
        int w = p.maxArea(height);
        assertEquals(49, w);
    }

    @Test
    void testCase_3() { 
        MaxWater p = new MaxWater();
        int[] height = { 2,2,2,2};
        int w = p.maxArea(height);
        assertEquals(6, w);
    }

    @Test
    void testCase_4() { 
        MaxWater p = new MaxWater();
        int[] height = { 2,15,20,2,2};
        int w = p.maxArea(height);
        assertEquals(15, w);
    }

    @Test
    void testCase_5() { 
        MaxWater p = new MaxWater();
        int[] height = { 2,20,15,2,2};
        int w = p.maxArea(height);
        assertEquals(15, w);
    }
    //[2,3,4,5,18,17,6]
    @Test
    void testCase_6() { 
        MaxWater p = new MaxWater();
        int[] height = { 2,3,4,5,18,17,6};
        int w = p.maxArea(height);
        assertEquals(17, w);
    }

    @Test
    void testCase_7() { 
        MaxWater p = new MaxWater();
        int[] height = { 18,17,6,5,4,3,2};
        int w = p.maxArea(height);
        assertEquals(17, w);
    }
    
    @Test
    void testCase_8() { 
        MaxWater p = new MaxWater();
        int[] height = { 18,17,6,5,4,3,2};
        int w = p.maxArea(height);
        assertEquals(17, w);
    }

    @Test
    void testCase_9() {
        String line = "1,2,3,1,2,2,1,2,3,";
        int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        assertEquals(9,numbers.length);
    } 

    @Test
    void testCase_10() {
        BufferedReader bufferedReader = null;
        String fileLocation = "C:/Users/u725561/maven-java/basic/src/test/java/com/example/basic/maxw.txt";
        try {
        FileReader fileReader = new FileReader(fileLocation);
         bufferedReader = new BufferedReader(fileReader);
        String line;
        int index = 1;
        line = bufferedReader.readLine();
        if(line != null) {
            System.out.println("line " + index + " : " + line);
            int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
            System.out.println( "len of array "+numbers.length);
            MaxWater p = new MaxWater();
            int w = p.maxArea(numbers);
            System.out.println( "w is "+w);
            
        }
    }
    catch(Exception e ){
        System.out.println("exception "+e.getMessage());
    }
    finally{
        try {
        bufferedReader.close();
        }
        catch ( Exception e ) {
            System.out.println("exception  during bufferedReader.close(); "+e.getMessage());
        }
    }
    }

    
    
}
