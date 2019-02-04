package com.leetcode.algorithm.medium.shortestbridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.shortestBridge(new int[][] {
        {0, 1}, {1, 0}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.shortestBridge(new int[][] {
        {0, 1, 0}, {0, 0, 0}, {0, 0, 1}
    }));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.shortestBridge(new int[][] {
        {1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}
    }));
  }
}
