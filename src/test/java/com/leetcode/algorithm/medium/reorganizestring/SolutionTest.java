package com.leetcode.algorithm.medium.reorganizestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("aba", solution.reorganizeString("aab"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("", solution.reorganizeString("aaab"));
  }
}
