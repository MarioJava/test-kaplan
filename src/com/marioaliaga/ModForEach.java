package com.marioaliaga;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maliaga on 14-07-16.
 */
public class ModForEach {

    public static void main(String... args){
        List<Integer> integerList = new ArrayList<>(0);

        integerList.add(new Integer(10));
        integerList.add(new Integer(1));
        integerList.add(new Integer(2));
        integerList.add(new Integer(3));

        muestraList(integerList);

        for (Integer integer : integerList){
            if (integer.equals(2)){
                integerList.clear();
                break;
            }
        }

        muestraList(integerList);

    }

    private static void muestraList(List<Integer> integers){
        for (Integer integer : integers){
            System.out.println(integer);
        }
        System.out.println("Size: " + integers.size());
    }
}
