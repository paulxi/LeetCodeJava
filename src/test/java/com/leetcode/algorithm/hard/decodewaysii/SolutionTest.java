package com.leetcode.algorithm.hard.decodewaysii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(9, solution.numDecodings("*"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(18, solution.numDecodings("1*"));
  }
}
