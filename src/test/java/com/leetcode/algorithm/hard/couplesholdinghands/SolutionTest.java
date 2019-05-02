package com.leetcode.algorithm.hard.couplesholdinghands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.minSwapsCouples(new int[] {0, 2, 1, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.minSwapsCouples(new int[] {3, 2, 0, 1}));
  }
}
