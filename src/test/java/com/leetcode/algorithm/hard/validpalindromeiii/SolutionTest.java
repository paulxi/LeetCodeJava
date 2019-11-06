package com.leetcode.algorithm.hard.validpalindromeiii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isValidPalindrome("abcdeca", 2));
  }
}
