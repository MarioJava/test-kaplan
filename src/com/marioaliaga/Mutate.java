package com.marioaliaga;

/**
 * Created by maliaga on 14-07-16.
 */
public class Mutate {

    public static void main(String [] args) {
        StringBuilder s = new StringBuilder("012345678 ");
        if (s.length() == 10)
            s.insert(10, "abcdef");
            s.delete(3,8);
            System.out.println(s.indexOf("c"));
        }
}

//R: 7