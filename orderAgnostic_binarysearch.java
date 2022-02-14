package com.company;

import java.util.Arrays;

public class orderAgnostic_binarysearch {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 15, 16, 23 , 89, 43, 10, 56, 67};
        Arrays.sort(arr);
        int target = 56;
        int ans = orderagnosticBS(arr, target);
        System.out.println(ans);
    }


    static int orderagnosticBS ( int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
//         boolean isAsc;
//         if (arr[start]< arr[end]){
//              isAsc = true;
//         }else{
//             isAsc = false;
//         }

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // find middle element
            // int mid = start + end/2;
//might be the case that start+ end can exceed the integer range in java
            int mid = start +  (end - start)/2; //which is actually start + end/2 only if you look at it

            if(arr[mid]== target){
                return mid;
            }


            if (isAsc) {
                if(target < arr[mid]){
                    end = mid -1;
                } else if(target > arr[mid]){
                    start= mid + 1;
                }
            }else{
                if (target > arr[mid]){
                    end = mid -1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }


        }


    }
        return -1;
  }

  
}
