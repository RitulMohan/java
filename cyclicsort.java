package com.company;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        //when given numbers in range 1 to n use cyclic sort
        //sorts the array in a single pass
        //see '1 to n' : apply cyclic sort

        int[] arr={3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] arr){
        int i=0;
        while (i < arr.length){
            int correct_index = arr[i]-1;
            if(arr[i]!=arr[correct_index]){
               swap(arr, i, correct_index);
            }else{
                i++;
            }
        }
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
