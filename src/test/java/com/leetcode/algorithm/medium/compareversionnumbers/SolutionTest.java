package com.leetcode.algorithm.medium.compareversionnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(-1, solution.compareVersion("0.1", "1.1"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.compareVersion("1.0.1", "1"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(-1, solution.compareVersion("7.5.2.4", "7.5.3"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(0, solution.compareVersion("1.01", "1.001"));
  }
}
