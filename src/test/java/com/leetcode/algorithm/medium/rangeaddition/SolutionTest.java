package com.leetcode.algorithm.medium.rangeaddition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {-2, 0, 3, 5, 3},
        solution.getModifiedArray(
            5,
            new int[][] {
              {1, 3, 2},
              {2, 4, 3},
              {0, 2, -2}
            }));
  }
}
