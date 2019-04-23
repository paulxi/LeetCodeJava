package com.leetcode.algorithm.medium.integerbreak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.integerBreak(2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(36, solution.integerBreak(10));
  }
}
