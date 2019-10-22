package com.leetcode.algorithm.medium.longestcommonsubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
  }
}
