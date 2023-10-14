package com.javaColl;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrListDemo1 {
    public static void main(String[] args) {
//        declare Arraylist
//        ArrayList al = new ArrayList(); --- Heterogeneous Element
//        ArrayList<Integer> al = new ArrayList<Integer>(); ---Homogenous Element
//        ArrayList <String> al = new ArrayList <String> ();---Homogenous Element
//        List al = new Arraylist(); Referencing

        ArrayList al = new ArrayList();

//        add new element to the arrayList
        al.add(100);
        al.add("Welcome");
        al.add(15.55);
        al.add('A');
        al.add(true);
        System.out.println(al); //[100, Welcome, 15.55, A, true]
//        how may el in the al size()
        System.out.println("Number of element in array list " + al.size());
//        remove() deleting el from Arraylist
        al.remove(1); //welcome an element in first location has been removed [100, 15.55, A, true]
        System.out.println(al);

//        insert new element = add(index, object)
        al.add(2, "Java");
        al.add(3, "serverSaveFront");
        System.out.println("after insertion "+ al);
//        retrieve a specific value = get()
        System.out.println( al.get(3));
//        change element/Replace objects..
        al.set(2, "C#");
        System.out.println("After replacing with the new element " + al);

//        searching ==Contains()-RETURN TRUE/FALSE
        System.out.println(al.contains("C#")); //true
        System.out.println(al.contains("Java"));//false
//        is empty ()
        System.out.println(al.isEmpty());//False

//        reading the data
//        1. for loop
//        System.out.println("Reading the data using For loop....");
//        for(int i=0; i>=al.size(); i++){
//            System.out.println(al.get(i));
//
//        }
//        2) fo each loop
        System.out.println("---- reading element using for each loop -----");
        for(Object e:al){
            System.out.println(e);
        }
    }
}
