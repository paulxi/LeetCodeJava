package com.leetcode.algorithm.easy.validmountainarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(false, solution.validMountainArray(new int[] {2, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.validMountainArray(new int[] {3, 5, 5}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(true, solution.validMountainArray(new int[] {0, 3, 2, 1}));
  }
}
