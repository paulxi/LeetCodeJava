package com.leetcode.algorithm.hard.shortestpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("aaacecaaa", solution.shortestPalindrome("aacecaaa"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("dcbabcd", solution.shortestPalindrome("abcd"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("aaacecaaa", solution.shortestPalindrome2("aacecaaa"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals("dcbabcd", solution.shortestPalindrome2("abcd"));
  }
}
