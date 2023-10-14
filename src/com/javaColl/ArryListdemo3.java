package com.javaColl;

import java.util.ArrayList;
import java.util.Arrays;

public class ArryListdemo3 {
    public static void main(String[] args) {
        String arr[] = {"Dog", "Cat", "Elephhant"};
        for(String value:arr){
            System.out.println(value);
        }
        ArrayList ar = new ArrayList(Arrays.asList(arr));
        System.out.println(ar);
    }
}
