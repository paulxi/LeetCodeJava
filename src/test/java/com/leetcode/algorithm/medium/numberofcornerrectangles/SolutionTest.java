package com.leetcode.algorithm.medium.numberofcornerrectangles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.countCornerRectangles(new int[][] {
        {1, 0, 0, 1, 0},
        {0, 0, 1, 0, 1},
        {0, 0, 0, 1, 0},
        {1, 0, 1, 0, 1}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(9, solution.countCornerRectangles(new int[][] {
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1}
    }));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(0, solution.countCornerRectangles(new int[][] {
        {1, 1, 1, 1}
    }));
  }
}
