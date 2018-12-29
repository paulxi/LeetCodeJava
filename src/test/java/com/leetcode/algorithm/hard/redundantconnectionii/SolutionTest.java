package com.leetcode.algorithm.hard.redundantconnectionii;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {2, 3}, solution.findRedundantDirectedConnection(new int[][] {
        {1, 2}, {1, 3}, {2, 3}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {4, 1}, solution.findRedundantDirectedConnection(new int[][] {
        {1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 5}
    }));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {3, 1}, solution.findRedundantDirectedConnection(new int[][] {
        {1, 2}, {2, 3}, {3, 1}, {4, 1}, {1, 5}
    }));
  }
}
