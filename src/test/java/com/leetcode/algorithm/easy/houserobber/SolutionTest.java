package com.leetcode.algorithm.easy.houserobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.rob(new int[] {1, 2, 3, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(12, solution.rob(new int[] {2, 7, 9, 3, 1}));
  }
}
