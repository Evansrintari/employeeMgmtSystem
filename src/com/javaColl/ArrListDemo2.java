package com.javaColl;

import java.util.ArrayList;
import java.util.Collections;

public class ArrListDemo2 {
    public static void main(String[] args) {


        ArrayList ala = new ArrayList();
        ala.add("X");
        ala.add("R");
        ala.add("T");
        ala.add("U");
        ala.add("I");
        ala.add("O");
        ArrayList alDup = new ArrayList();
        alDup.addAll(ala);//[X, Y, T, U, I, O]
        alDup.removeAll(ala);//After removing: []

        System.out.println("After removing: " +alDup);
//        sort -- collection sort
        System.out.println("Elements in the arrayList: "+ ala);//[X, R, T, U, I, O]
        Collections.sort(ala);
        System.out.println("Element after sorting " + ala);//[I, O, R, T, U, X]
        Collections.sort(ala, Collections.reverseOrder());
        System.out.println("Elements in the array list after sorting in reverse order:" + ala);//[X, U, T, R, O, I]

//        shuffling
        Collections.shuffle(ala);
        System.out.println("Element in the array after Shuffling " + ala);//[R, I, O, U, T, X]


    }
}
