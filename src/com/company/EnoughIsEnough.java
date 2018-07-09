package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class EnoughIsEnough {

    private EnoughIsEnough(){

    }
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        // return an array
        // example input: ([1,2,3,1,2,1,2,3],2) Output: [1,2,3,1,2,3]
        // make sure numbers in the list only repeat n times, and return a list without changing the position any of the integers
        ArrayList<Integer> temp_arrayList = new ArrayList<>();
        for(int i = 0; i<elements.length; i++){
            int frequency = Collections.frequency(temp_arrayList, elements[i]);
            if(frequency< maxOccurrences){
                temp_arrayList.add(elements[i]);
            }
        }
        int[] arr = new int[temp_arrayList.size()];
        for(int i = 0; i < temp_arrayList.size(); i++){
            arr[i] = temp_arrayList.get(i);
        }
        return arr;
    }
}
