package com.github.qinpeng2.ap.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2_AddTwoNumbersTest {

    private S0002_AddTwoNumbers solution = new S0002_AddTwoNumbers();

    @Test
    public void addTwoNumbers1() {
        S0002_AddTwoNumbers.ListNode l1 = fromArray(new int[]{8, 1});
        S0002_AddTwoNumbers.ListNode l2 = fromArray(new int[]{0});
        S0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        String strResult = toString(result);
        System.out.println(strResult);
        assertEquals(strResult, "81");
    }

    @Test
    public void addTwoNumbers2() {
        S0002_AddTwoNumbers.ListNode l1 = fromArray(new int[]{2, 4, 3});
        S0002_AddTwoNumbers.ListNode l2 = fromArray(new int[]{5, 6, 4});
        S0002_AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);
        String strResult = toString(result);
        System.out.println(strResult);
        assertEquals(strResult, "708");
    }

    public S0002_AddTwoNumbers.ListNode fromArray(int[] arrays) {

        S0002_AddTwoNumbers.ListNode listNode = null;

        S0002_AddTwoNumbers.ListNode pointer = null;

        for (int i : arrays) {
            if (listNode == null) {
                listNode = new S0002_AddTwoNumbers.ListNode(i);
                pointer = listNode;
            } else {
                pointer.next = new S0002_AddTwoNumbers.ListNode(i);
                pointer = pointer.next;
            }
        }

        return listNode;
    }

    public String toString(S0002_AddTwoNumbers.ListNode listNode) {

        StringBuilder buffer = new StringBuilder();
        do {
            buffer.append(listNode.val);
            listNode = listNode.next;
        } while (listNode != null);

        return buffer.toString();
    }

}