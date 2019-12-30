package com.github.qinpeng2.ap.leetcode;

import java.util.ArrayList;
import java.util.List;

public class S0004_FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLenth = nums1.length + nums2.length;

        boolean middle = false;
        int middleIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        if (totalLenth % 2 == 0) {
            leftIndex = totalLenth / 2 - 1;
            rightIndex = totalLenth / 2 ;
        } else {
            middle = true;
            middleIndex = totalLenth / 2;
        }

        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        double result = 0;
        while (i < nums1.length || j < nums2.length) {

            Integer n1 = null;
            Integer n2 = null;
            if (i < nums1.length) {
                n1 = nums1[i];
            }

            if (j < nums2.length) {
                n2 = nums2[j];
            }

            if (n1 != null && (n2 == null || n1 <= n2)) {
                list.add(n1);
                i ++;
            }

            if (n2 != null && (n1 == null || n2 < n1)) {
                list.add(n2);
                j ++;
            }

            int count = list.size();
            if (middle) {
                if (count - 1 == middleIndex) {
                    result = list.get(middleIndex);
                    break;
                }

            } else {

                if (count -1 == rightIndex){
                    result = (list.get(leftIndex) + list.get(rightIndex)) / 2.0d;
                    break;
                }
            }


        }

        return result;
    }
}
