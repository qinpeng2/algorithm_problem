package com.github.qinpeng2.ap.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2_AddTwoNumbersTest {

    private Solution2_AddTwoNumbers solution = new Solution2_AddTwoNumbers();

    @Test
    public void addTwoNumbers1() {
        Solution2_AddTwoNumbers.ListNode l1 = fromArray(new int[]{8, 1});
        Solution2_AddTwoNumbers.ListNode l2 = fromArray(new int[]{0});
        Solution2_AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        String strResult = toString(result);
        System.out.println(strResult);
        assertEquals(strResult, "81");
    }

    @Test
    public void addTwoNumbers2() {
        Solution2_AddTwoNumbers.ListNode l1 = fromArray(new int[]{2, 4, 3});
        Solution2_AddTwoNumbers.ListNode l2 = fromArray(new int[]{5, 6, 4});
        Solution2_AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        String strResult = toString(result);
        System.out.println(strResult);
        assertEquals(strResult, "708");
    }

    public Solution2_AddTwoNumbers.ListNode fromArray(int[] arrays) {

        Solution2_AddTwoNumbers.ListNode listNode = null;

        Solution2_AddTwoNumbers.ListNode pointer = null;

        for (int i : arrays) {
            if (listNode == null) {
                listNode = new Solution2_AddTwoNumbers.ListNode(i);
                pointer = listNode;
            } else {
                pointer.next = new Solution2_AddTwoNumbers.ListNode(i);
                pointer = pointer.next;
            }
        }

        return listNode;
    }

    public String toString(Solution2_AddTwoNumbers.ListNode listNode) {

        StringBuilder buffer = new StringBuilder();
        do {
            buffer.append(listNode.val);
            listNode = listNode.next;
        } while (listNode != null);

        return buffer.toString();
    }

}