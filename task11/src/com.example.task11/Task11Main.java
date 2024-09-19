package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {return;}
        int min = Arrays.stream(arr).min().getAsInt();
        int numMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                numMin = i;
            }
        }
        int temp = arr[0];
        arr[0] = min;
        arr[numMin] = temp;
    }

}