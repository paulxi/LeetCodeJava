package com.leetcode.algorithm.easy.longestcontinuousincreasing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.findLengthOfLCIS(new int[] {1, 3, 5, 4, 7}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.findLengthOfLCIS(new int[] {2, 2, 2, 2, 2}));
  }
}
