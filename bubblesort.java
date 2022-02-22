package com.company;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {

        //aka sinking sort
        //bubble sort is a compare sort method
        //in the first pass the largest element comes at the end
        //in second pass the second largest element occupies the second last position


        //space complexity: O(1) i.e. constant
        //time complexity: O(N)  //n be like the number of comparisions
        //worst case: O(N sqr) here array is sorted in the reverse direction
        //as size of array is growing, number of comparisions is also growing

        //WHEN j NEVER SWAPS FOR A VALUE OF i IT MEANS THE ARRAY IS SORTED
        //*stable* sorting algorithm:  order of equal elements is also maitained

        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));


    }


    static void bubble(int[] arr){

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped= false;
            for (int j = 1 ; j < arr.length-i; j++) {
                //swap if the item is smaller than the prev item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    swapped = true;

                }
            }

           // if you did not swap for a particular value of i, it means array is sorted hence stop the program
           if(swapped==false){
               break;
           }
        }
    }
}
