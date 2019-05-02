package com.leetcode.algorithm.hard.rectangleareaii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        6,
        solution.rectangleArea(
            new int[][] {
              {0, 0, 2, 2},
              {1, 0, 2, 3},
              {1, 0, 3, 1}
            }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(49, solution.rectangleArea(new int[][] {{0, 0, 1000000000, 1000000000}}));
  }
}
