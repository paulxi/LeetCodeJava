package com.leetcode.algorithm.medium.bullsandcows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals("1A3B", solution.getHint("1807", "7810"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals("1A1B", solution.getHint("1123", "0111"));
  }
}