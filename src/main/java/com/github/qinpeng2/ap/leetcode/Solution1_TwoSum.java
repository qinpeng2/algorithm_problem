package com.github.qinpeng2.ap.leetcode;

public class Solution1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int i;
        int j = 0;

        for (i = 0; i < nums.length; i++) {
            // each time lookup value
            int lookup = target - nums[i];
            boolean found = false;
            for (j = i + 1; j < nums.length; j++) {
                if (lookup == nums[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        return new int[]{i, j};
    }

}
