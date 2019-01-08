package com.leetcode.algorithm.hard.besttimetobuyandsellstockiii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.maxProfit(new int[] {3, 3, 5, 0, 0, 3, 1, 4}));
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

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(13, solution.maxProfit(new int[] {1,2,4,2,5,7,2,4,9,0}));
  }
}
