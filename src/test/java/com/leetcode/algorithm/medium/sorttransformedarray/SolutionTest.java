package com.leetcode.algorithm.medium.sorttransformedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {3, 9, 15, 33},
        solution.sortTransformedArray(new int[] {-4, -2, 2, 4}, 1, 3, 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {-23, -5, 1, 7},
        solution.sortTransformedArray(new int[] {-4, -2, 2, 4}, -1, 3, 5));
  }
}
