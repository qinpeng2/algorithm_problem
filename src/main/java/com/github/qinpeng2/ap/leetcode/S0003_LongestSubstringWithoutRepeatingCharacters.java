package com.github.qinpeng2.ap.leetcode;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class S0003_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        Deque<Character> deque = new LinkedList<>();
        Set<Character> set = new HashSet<>();
        int maxNum = 0;
        String maxSubstring = null;

        char[] chars = s.toCharArray();
        for (char c : chars) {
            // try to add an element into set
            boolean added = set.add(c);
            // already exists, remove them
            if (deque.size() > 0 && !added) {
                while (!deque.isEmpty()) {
                    Character poped = deque.pop();
                    if (poped == c) {
                        break;
                    }
                    set.remove(poped);
                }
            }
            deque.addLast(c);
            if (deque.size() > maxNum) {
                maxNum = deque.size();
//                maxSubstring = deque.toString();
            }
        }

//        System.out.println(maxSubstring);
        return maxNum;
    }
}
