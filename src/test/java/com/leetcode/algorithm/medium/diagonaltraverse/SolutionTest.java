package com.leetcode.algorithm.medium.diagonaltraverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {1, 2, 4, 7, 5, 3, 6, 8, 9},
        solution.findDiagonalOrder(
            new int[][] {
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}
            }));
  }
}
