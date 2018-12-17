package com.leetcode.algorithm.hard.countdifferentpalindromicsubsequences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.countPalindromicSubsequences("bccb"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(104860361,
        solution.countPalindromicSubsequences("abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"));
  }
}
