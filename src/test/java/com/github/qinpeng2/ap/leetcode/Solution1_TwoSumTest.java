package com.github.qinpeng2.ap.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution1_TwoSumTest {

    Solution1_TwoSum solution = new Solution1_TwoSum();

    @Test
    public void twoSum1() {
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
        int[] expect = {0, 1};
        assertArrayEquals(result, expect);
    }

}