package com.github.qinpeng2.ap.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class S0003_LongestSubstringWithoutRepeatingCharactersTest {

    S0003_LongestSubstringWithoutRepeatingCharacters solution = new S0003_LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void sampleTest1() {
        generalLengthOfLongestSubstringTest("abcabcbb", 3);
    }

    @Test
    public void sampleTest2() {
        generalLengthOfLongestSubstringTest("bbbbb", 1);
    }

    @Test
    public void sampleTest3() {
        generalLengthOfLongestSubstringTest("pwwkew", 3);
    }

    @Test
    public void sampelTest4() {
        generalLengthOfLongestSubstringTest("dvdf", 3);
    }

    @Test
    public void sampleTest5() {
        generalLengthOfLongestSubstringTest("abba", 2);
    }

    @Test
    public void sampelTest6() {
        generalLengthOfLongestSubstringTest("tmmzuxt", 5);
    }


    public void generalLengthOfLongestSubstringTest(String input, int expect) {
        assertEquals(solution.lengthOfLongestSubstring(input), expect);
    }
}