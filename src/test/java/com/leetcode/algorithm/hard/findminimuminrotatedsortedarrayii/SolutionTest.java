package com.leetcode.algorithm.hard.findminimuminrotatedsortedarrayii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.findMin(new int[] {1, 3, 5}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.findMin(new int[] {2, 2, 2, 0, 1}));
  }
}
