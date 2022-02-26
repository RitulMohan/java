package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class allduplicates {

    public static void main(String[] args) {
            int[] nums={4,2,3,1,6,7,8,2,3};
        findDuplicates(nums);

    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; ) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else i++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) list.add(nums[i]);
        }

        return list;
    }


    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;


    }
}