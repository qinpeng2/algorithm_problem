package com.github.qinpeng2.ap.leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution2_AddTwoNumbers {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 考察点：数据结构的使用
     * 重要思路：逆序是一个重要的提示，因为我们手动计算加法是就是从低位到高位的逆向计算的
     * 解题思路：按位计算，注意进位
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode pointNode = null;
        ListNode headNode = null;

        int carry = 0;
        do {
            int val1 = 0;
            int val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }

            int added = val1 + val2 + carry;

            int val = added % 10;
            carry = added / 10;

            if (headNode == null) {
                headNode = new ListNode(val);
                pointNode = headNode;
            } else {
                pointNode.next = new ListNode(val);
                pointNode = pointNode.next;
            }

        } while (l1 != null || l2 != null);

        if (carry > 0) {
            pointNode.next = new ListNode(carry);
        }

        return headNode;

    }
}
