package com.company;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {

        int[] arr={5,7,6,2,3,4,9,8,1};
        selection(arr);
        //performs better on smaller arrays
    }

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) //n-1 checks
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }

            //swap 
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println(Arrays.toString(arr));
    }
}





