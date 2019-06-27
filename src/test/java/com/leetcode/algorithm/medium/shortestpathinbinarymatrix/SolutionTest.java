package com.leetcode.algorithm.medium.shortestpathinbinarymatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.shortestPathBinaryMatrix(new int[][] {{0, 1}, {1, 0}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        4, solution.shortestPathBinaryMatrix(new int[][] {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
  }
}
