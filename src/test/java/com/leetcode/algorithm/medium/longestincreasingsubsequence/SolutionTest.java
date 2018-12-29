package com.leetcode.algorithm.medium.longestincreasingsubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
  }
}
