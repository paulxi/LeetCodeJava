package com.leetcode.algorithm.medium.nextclosesttime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("19:39", solution.nextClosestTime("19:34"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("22:22", solution.nextClosestTime("23:59"));
  }
}
