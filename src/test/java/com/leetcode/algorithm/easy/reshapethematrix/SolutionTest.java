package com.leetcode.algorithm.easy.reshapethematrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[][] {{1, 2, 3, 4}}, solution.matrixReshape(new int[][] {{1, 2}, {3, 4}}, 1, 4));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[][] {{1, 2}, {3, 4}}, solution.matrixReshape(new int[][] {{1, 2}, {3, 4}}, 2, 4));
  }
}
