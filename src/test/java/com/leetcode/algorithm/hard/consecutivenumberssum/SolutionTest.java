package com.leetcode.algorithm.hard.consecutivenumberssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.consecutiveNumbersSum(5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.consecutiveNumbersSum(9));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(4, solution.consecutiveNumbersSum(15));
  }
}
