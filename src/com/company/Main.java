package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20,37,20,21};
        int[] ans = {};
        ans = EnoughIsEnough.deleteNth(arr,1);
        //testing the answer
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        System.out.println(ans[2]);
    }
}
