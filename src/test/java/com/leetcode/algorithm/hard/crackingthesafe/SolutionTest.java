package com.leetcode.algorithm.hard.crackingthesafe;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("01", solution.crackSafe(1, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("00110", solution.crackSafe(2, 2));
  }
}
