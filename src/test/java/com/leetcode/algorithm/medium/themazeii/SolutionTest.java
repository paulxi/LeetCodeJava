package com.leetcode.algorithm.medium.themazeii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(12, solution.shortestDistance(new int[][] {
        {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0},
        {1, 1, 0, 1, 1},
        {0, 0, 0, 0, 0}
    }, new int[] {0, 4}, new int[] {4, 4}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.shortestDistance(new int[][] {
        {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0},
        {1, 1, 0, 1, 1},
        {0, 0, 0, 0, 0}
    }, new int[] {0, 4}, new int[] {3, 2}));
  }
}
