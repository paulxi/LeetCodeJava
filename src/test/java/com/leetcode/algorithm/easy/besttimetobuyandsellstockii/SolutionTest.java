package com.leetcode.algorithm.easy.besttimetobuyandsellstockii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(7, solution.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(4, solution.maxProfit(new int[] {1, 2, 3, 4, 5}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxProfit(new int[] {7, 6, 4, 3, 1}));
  }
}

