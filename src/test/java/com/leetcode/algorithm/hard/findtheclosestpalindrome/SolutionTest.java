package com.leetcode.algorithm.hard.findtheclosestpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("121", solution.nearestPalindromic("123"));
  }
}
