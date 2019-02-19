package com.leetcode.algorithm.medium.spiralmatrixii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[][] {
        {1, 2, 3},
        {8, 9, 4},
        {7, 6, 5}
    }, solution.generateMatrix(3));
  }
}
