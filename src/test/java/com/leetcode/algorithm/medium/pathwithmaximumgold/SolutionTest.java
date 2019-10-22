package com.leetcode.algorithm.medium.pathwithmaximumgold;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(24, solution.getMaximumGold(new int[][] {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        28,
        solution.getMaximumGold(
            new int[][] {{1, 0, 7}, {2, 0, 6}, {3, 4, 5}, {0, 3, 0}, {9, 0, 20}}));
  }
}
