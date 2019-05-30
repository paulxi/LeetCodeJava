package com.leetcode.algorithm.hard.longestduplicatesubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("ana", solution.longestDupSubstring("banana"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("", solution.longestDupSubstring("abcd"));
  }
}
