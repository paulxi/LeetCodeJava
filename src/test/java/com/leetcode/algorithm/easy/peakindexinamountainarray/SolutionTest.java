package com.leetcode.algorithm.easy.peakindexinamountainarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.peakIndexInMountainArray(new int[] {0, 1, 0}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.peakIndexInMountainArray(new int[] {0, 2, 1, 0}));
  }
}
