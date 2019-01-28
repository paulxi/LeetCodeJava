package com.leetcode.algorithm.medium.coursescheduleii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {0, 1}, solution.findOrder(2, new int[][] {{1, 0}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {0, 1, 2, 3}, solution.findOrder(4, new int[][] {{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
  }
}
