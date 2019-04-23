package com.leetcode.algorithm.easy.findpivotindex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.pivotIndex(new int[] {1, 2, 3}));
  }
}
