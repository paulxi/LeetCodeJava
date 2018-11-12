package com.leetcode.algorithm.hard.largestrectangleinhistogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] heights = {2, 1, 5, 6, 2, 3};
    assertEquals(10, solution.largestRectangleArea(heights));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    int[] heights = {0, 0, 0, 0, 0, 0, 0, 0, 2147483647};
    assertEquals(2147483647, solution.largestRectangleArea(heights));
  }
}
