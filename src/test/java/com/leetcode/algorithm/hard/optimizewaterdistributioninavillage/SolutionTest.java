package com.leetcode.algorithm.hard.optimizewaterdistributioninavillage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        3,
        solution.minCostToSupplyWater(3, new int[] {1, 2, 2}, new int[][] {{1, 2, 1}, {2, 3, 1}}));
  }
}


