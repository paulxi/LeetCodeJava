package com.leetcode.algorithm.easy.toeplitzmatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isToeplitzMatrix(new int[][] {
        {1, 2, 3, 4},
        {5, 1, 2, 3},
        {9, 5, 1, 2}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.isToeplitzMatrix(new int[][] {
        {1, 2},
        {2, 2}
    }));
  }
}
