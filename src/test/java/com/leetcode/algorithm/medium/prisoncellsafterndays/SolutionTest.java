package com.leetcode.algorithm.medium.prisoncellsafterndays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {0, 0, 1, 1, 0, 0, 0, 0},
        solution.prisonAfterNDays(new int[] {0, 1, 0, 1, 1, 0, 0, 1}, 7));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {0, 0, 1, 1, 1, 1, 1, 0},
        solution.prisonAfterNDays(new int[] {1, 0, 0, 1, 0, 0, 1, 0}, 1000000000));
  }
}
