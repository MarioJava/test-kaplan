package com.marioaliaga;

/**
 * Created by maliaga on 14-07-16.
 */
public class StringSplit {

    public static void main(String... args){
        String s = "x1234 y56 z7 a";
        String [] sa = s.split("\\d");
        int count = 0;
        for( String x : sa)
            count++;
        System.out.println("total: " + count);
    }
}

// R: total: 8
