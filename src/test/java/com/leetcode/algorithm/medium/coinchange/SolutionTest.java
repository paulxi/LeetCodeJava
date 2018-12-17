package com.leetcode.algorithm.medium.coinchange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(3, solution.coinChange(new int[] {1, 2, 5}, 11));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(-1, solution.coinChange(new int[] {2}, 3));
  }
}
