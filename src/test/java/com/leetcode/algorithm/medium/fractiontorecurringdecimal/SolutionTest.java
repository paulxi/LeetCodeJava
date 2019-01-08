package com.leetcode.algorithm.medium.fractiontorecurringdecimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("0.5", solution.fractionToDecimal(1, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("2", solution.fractionToDecimal(2, 1));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("0.(6)", solution.fractionToDecimal(2, 3));
  }
}
