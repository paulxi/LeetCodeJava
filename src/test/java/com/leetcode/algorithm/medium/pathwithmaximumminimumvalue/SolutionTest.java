package com.leetcode.algorithm.medium.pathwithmaximumminimumvalue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.maximumMinimumPath(new int[][] {{5, 4, 5}, {1, 2, 6}, {7, 4, 6}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        2, solution.maximumMinimumPath(new int[][] {{2, 2, 1, 2, 2, 2}, {1, 2, 2, 2, 1, 2}}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(
        3,
        solution.maximumMinimumPath(
            new int[][] {
              {3, 4, 6, 3, 4},
              {0, 2, 1, 1, 7},
              {8, 8, 3, 2, 7},
              {3, 2, 4, 9, 8},
              {4, 1, 2, 0, 0},
              {4, 6, 5, 4, 3}
            }));
  }
}
