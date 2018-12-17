package com.leetcode.algorithm.medium.friendcircles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.findCircleNum(new int[][] {
        {1, 1, 0},
        {1, 1, 0},
        {0, 0, 1}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.findCircleNum(new int[][] {
        {1, 1, 0},
        {1, 1, 1},
        {0, 1, 1}
    }));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.findCircleNum(new int[][] {
        {1, 0, 0, 1},
        {0, 1, 1, 0},
        {0, 1, 1, 1},
        {1, 0, 1, 1}
    }));
  }
}
