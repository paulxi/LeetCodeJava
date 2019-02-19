package com.leetcode.algorithm.medium.nextgreaterelementiii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(21, solution.nextGreaterElement(12));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.nextGreaterElement(21));
  }
}
