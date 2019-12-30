package com.github.qinpeng2.ap.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class S0004_FindMedianSortedArraysTest {

    S0004_FindMedianSortedArrays solution = new S0004_FindMedianSortedArrays();

    @Test
    public void findMedianSortedArrays1() {
        double result = solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        System.out.println(result);
        assertTrue(result == 2.0);
    }


    @Test
    public void findMedianSortedArrays2() {
        double result = solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(result);
        assertTrue(result == 2.5);
    }
}