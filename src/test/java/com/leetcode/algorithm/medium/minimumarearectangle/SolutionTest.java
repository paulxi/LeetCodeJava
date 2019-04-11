package com.leetcode.algorithm.medium.minimumarearectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.minAreaRect(new int[][] {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        2, solution.minAreaRect(new int[][] {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {4, 1}, {4, 3}}));
  }
}
