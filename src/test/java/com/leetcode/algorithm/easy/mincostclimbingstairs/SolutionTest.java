package com.leetcode.algorithm.easy.mincostclimbingstairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(15, solution.minCostClimbingStairs(new int[] {10, 15, 20}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(6, solution.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }
}
