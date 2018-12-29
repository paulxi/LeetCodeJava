package com.leetcode.algorithm.medium.redundantconnection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {2, 3}, solution.findRedundantConnection(new int[][] {
        {1, 2}, {1, 3}, {2, 3}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {1, 4}, solution.findRedundantConnection(new int[][] {
        {1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}
    }));
  }
}
