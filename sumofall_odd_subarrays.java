package com.company;

public class sumofall_odd_subarrays {
    public static void main(String[] args) {
int[] arr={38,24,3,9,7,29,6,5,26,40,10,13,27,11,32,40,4,4,22,37,29,1,23,40,14,10,12,3,15,19};
int ans = sumof(arr);
        System.out.println(ans);
    }

    public static int sumof(int[] arr) {
//        int sum = 0;
////        int n = 0;
//
//        for (int i = 0; i < arr.length ; i++) {
//            sum =sum+ arr[i];
//        }
//        if(arr.length>2) {
//            for (int i = 0; i < arr.length - 2; i++) {
//                sum = sum + arr[i] + arr[i + 1] + arr[i + 2];
//            }
//        }
//        if(arr.length>4) {
//            for (int i = 0; i < arr.length - 4; i++) {
//                sum = sum + arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] + arr[i + 4];
//            }
//        }
//        if(arr.length>6) {
//            for (int i = 0; i < arr.length - 6; i++) {
//                sum = sum + arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] + arr[i + 4]+arr[i+5]+arr[i+6];
//            }
//        }
//        if(arr.length>8) {
//            for (int i = 0; i < arr.length - 8; i++) {
//                sum = sum + arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] + arr[i + 4]+arr[i+5]+arr[i+6]+arr[i+7]+arr[i+8];
//            }
//        }
//        if(arr.length>10) {
//            for (int i = 0; i < arr.length - 10; i++) {
//                sum = sum + arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] + arr[i + 4]+arr[i+5]+arr[i+6]+arr[i+7]+arr[i+7]+arr[i+8]+arr[i+9]+arr[i+10];
//            }
//        }

        int sum = 0;
        int group = 3;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        while (group <= arr.length) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; i + group <= arr.length && j < i + group && j < arr.length; j++) {
                    sum += arr[j];
                }
            }
            group += 2;
        }

        return sum;
    }
}
