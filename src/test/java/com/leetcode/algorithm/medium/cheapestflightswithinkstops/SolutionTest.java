package com.leetcode.algorithm.medium.cheapestflightswithinkstops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(200, solution.findCheapestPrice(3, new int[][] {
        {0, 1, 100}, {1, 2, 100}, {0, 2, 500}
    }, 0, 2, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(500, solution.findCheapestPrice(3, new int[][] {
        {0, 1, 100}, {1, 2, 100}, {0, 2, 500}
    }, 0, 2, 0));
  }
}
