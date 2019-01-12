package com.leetcode.algorithm.medium.coinchange2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.change(5, new int[] {1, 2, 5}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.change(3, new int[] {2}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.change(10, new int[] {10}));
  }
}
