package com.leetcode.algorithm.hard.longestincreasingpathinamatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.longestIncreasingPath(new int[][] {
        {9, 9, 4},
        {6, 6, 8},
        {2, 1, 1}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(4, solution.longestIncreasingPath(new int[][] {
        {3, 4, 5},
        {3, 2, 6},
        {2, 2, 1}
    }));
  }
}
