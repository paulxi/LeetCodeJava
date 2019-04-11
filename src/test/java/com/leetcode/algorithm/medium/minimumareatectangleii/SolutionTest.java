package com.leetcode.algorithm.medium.minimumareatectangleii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        2.0, solution.minAreaFreeRect(new int[][] {{1, 2}, {2, 1}, {1, 0}, {0, 1}}), 0.0001);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        1.0,
        solution.minAreaFreeRect(new int[][] {{0, 1}, {2, 1}, {1, 1}, {1, 0}, {2, 0}}),
        0.0001);
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(
        0.0,
        solution.minAreaFreeRect(new int[][] {{0, 3}, {1, 2}, {3, 1}, {1, 3}, {2, 1}}),
        0.0001);
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(
        2.0,
        solution.minAreaFreeRect(
            new int[][] {{3, 1}, {1, 1}, {0, 1}, {2, 1}, {3, 3}, {3, 2}, {0, 2}, {2, 3}}),
        0.0001);
  }
}
