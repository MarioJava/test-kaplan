package com.marioaliaga;

/**
 * Created by maliaga on 19-07-16.
 */
public class Flibitz {

    public static void main(String[] args) {
        int grop = 7;
        new Flibitz().go(grop);
        System.out.print(grop);
    }

    void go(int grop) {

        if (grop++ > 7) ++grop;
        System.out.print(grop);
    }
}

//R: 87
