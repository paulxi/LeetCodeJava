package com.leetcode.algorithm.medium.uniquepathsii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.uniquePathsWithObstacles(new int[][] {
        {0, 0, 0},
        {0, 1, 0},
        {0, 0, 0}
    }));
  }
}
