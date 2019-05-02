package com.leetcode.algorithm.easy.rectangleoverlap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isRectangleOverlap(new int[] {0, 0, 2, 2}, new int[] {1, 1, 3, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        false, solution.isRectangleOverlap(new int[] {0, 0, 1, 1}, new int[] {1, 0, 2, 1}));
  }
}
