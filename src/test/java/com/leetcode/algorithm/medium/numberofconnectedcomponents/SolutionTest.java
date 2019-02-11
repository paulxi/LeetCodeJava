package com.leetcode.algorithm.medium.numberofconnectedcomponents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.countComponents(5, new int[][] {
        {0, 1}, {1, 2}, {3, 4}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.countComponents(5, new int[][] {
        {0, 1}, {1, 2}, {2, 3}, {3, 4}
    }));
  }
}
