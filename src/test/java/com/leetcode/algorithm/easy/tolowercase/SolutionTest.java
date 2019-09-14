package com.leetcode.algorithm.easy.tolowercase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("hello", solution.toLowerCase("Hello"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("here", solution.toLowerCase("here"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("lovely", solution.toLowerCase("LOVELY"));
  }
}
