package com.leetcode.algorithm.easy.squaresofasortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {0, 1, 9, 16, 100}, solution.sortedSquares(new int[] {-4, -1, 0, 3, 10}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {4, 9, 9, 49, 121}, solution.sortedSquares(new int[] {-7, -3, 2, 3, 11}));
  }
}
