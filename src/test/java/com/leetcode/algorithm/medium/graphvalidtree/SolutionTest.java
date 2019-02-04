package com.leetcode.algorithm.medium.graphvalidtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.validTree(5, new int[][] {
        {0, 1}, {0, 2}, {0, 3}, {1, 4}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.validTree(5, new int[][] {
        {0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}
    }));
  }
}
