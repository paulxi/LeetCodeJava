package com.leetcode.algorithm.medium.longestmountaininarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.longestMountain(new int[] {2, 1, 4, 7, 3, 2, 5}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestMountain(new int[] {2, 2, 2}));
  }
}
