package com.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {


        List<Integer> list= new ArrayList<Integer>();

        for(int i=0; i<=100; i++){

            list.add(i);
        }

        for(int values:list){

            System.out.println(values);
        }
    }
}
