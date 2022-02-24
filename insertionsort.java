package com.company;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {

        int[] arr={5,3,4,2,1};
        //inserting the element in the correct position of its LHS
        //why insertion: steps reduce if array is sorted
        //number of swaps is less than bubble sort
        //prefer when the array is partially sorted

        insertion(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < 0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break; //already sorted, no need to check
                }

            }

        }
    }
}
