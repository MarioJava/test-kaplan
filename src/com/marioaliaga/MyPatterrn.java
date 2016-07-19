package com.marioaliaga;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by maliaga on 14-07-16.
 */
public class MyPatterrn {
    public static void main(String[] args) {
        String line = "Financial Year 2012 - 2013";
        String pattern ="\\d+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
        } else {
            System.out.println("NOT FOUND");
        }
    }
}

// R: Found value: 2012
