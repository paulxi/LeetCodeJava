package com.leetcode.algorithm.easy.besttimetobuyandsellstock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.maxProfit(new int[] {7,1,5,3,6,4}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxProfit(new int[] {7,6,4,3,1}));
  }
}
