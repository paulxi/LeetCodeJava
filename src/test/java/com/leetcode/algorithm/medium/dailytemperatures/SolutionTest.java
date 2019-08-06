package com.leetcode.algorithm.medium.dailytemperatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertArrayEquals(new int[] {1, 1, 4, 2, 1, 1, 0, 0},
        solution.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertArrayEquals(new int[] {1, 1, 4, 2, 1, 1, 0, 0},
        solution.dailyTemperatures2(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
  }
}
