package com.leetcode.algorithm.medium.decodeways;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(2, solution.numDecodings("12"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(3, solution.numDecodings("226"));
  }
}
