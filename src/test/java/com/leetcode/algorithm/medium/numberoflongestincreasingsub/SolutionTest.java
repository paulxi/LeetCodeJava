package com.leetcode.algorithm.medium.numberoflongestincreasingsub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.findNumberOfLIS(new int[] {1, 3, 5, 4, 7}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(5, solution.findNumberOfLIS(new int[] {2, 2, 2, 2, 2}));
  }
}
