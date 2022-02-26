package com.company;

import java.util.Arrays;

public class duplicate {
    public static void main (String[] args) {

        int[] nums={1,3,4,2,2};
        Arrays.sort(nums);
        int ans=findDuplicate(nums);
        System.out.println(ans);
    }

    static int findDuplicate(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++){

            if(nums[i]==i){
                break;
            }
        count++;
        }

        return count;
    }

}
