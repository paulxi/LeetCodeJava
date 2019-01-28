package com.leetcode.algorithm.medium.sortcolors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] colors = new int[] {2, 0, 2, 1, 1, 0};
    solution.sortColors(colors);
    assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, colors);
  }
}
