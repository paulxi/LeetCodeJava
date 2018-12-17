package com.leetcode.algorithm.hard.removeduplicateletters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("abc", solution.removeDuplicateLetters("bcabc"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("acdb", solution.removeDuplicateLetters("cbacdcbc"));
  }
}