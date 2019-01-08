package com.leetcode.algorithm.hard.besttimetobuyandsellstockiv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.maxProfit(2, new int[] {2, 4, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(7, solution.maxProfit(2, new int[] {3, 2, 6, 5, 0, 3}));
  }
}
