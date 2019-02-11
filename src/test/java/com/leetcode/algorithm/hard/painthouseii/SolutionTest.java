package com.leetcode.algorithm.hard.painthouseii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.minCostII(new int[][] {
        {1, 5, 3}, {2, 9, 4}
    }));
  }
}