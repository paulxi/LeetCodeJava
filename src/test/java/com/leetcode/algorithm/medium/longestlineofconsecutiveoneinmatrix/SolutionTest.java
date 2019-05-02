package com.leetcode.algorithm.medium.longestlineofconsecutiveoneinmatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.longestLine(new int[][] {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}}));
  }
}
