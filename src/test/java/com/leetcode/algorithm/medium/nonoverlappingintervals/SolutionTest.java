package com.leetcode.algorithm.medium.nonoverlappingintervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.eraseOverlapIntervals(new int[][] {{1, 2}, {1, 2}, {1, 2}}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(0, solution.eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}}));
  }
}
