package com.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        /*
        insertion order maintained
        Duplicates are allowed
        NUll are allowed
         */

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);

        list.add(90);
        list.add(20);

        list.add(1000000000);
        list.add(null);

       //System.out.println(list);
        System.out.println(list.get(1));
    }
}
