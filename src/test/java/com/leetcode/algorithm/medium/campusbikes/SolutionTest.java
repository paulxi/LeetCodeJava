package com.leetcode.algorithm.medium.campusbikes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {1, 0},
        solution.assignBikes(new int[][] {{0, 0}, {2, 1}}, new int[][] {{1, 2}, {3, 3}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {0, 2, 1},
        solution.assignBikes(
            new int[][] {{0, 0}, {1, 1}, {2, 0}}, new int[][] {{1, 0}, {2, 2}, {2, 1}}));
  }
}
