package com.leetcode.algorithm.medium.new21game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1.0, solution.new21Game(10, 1, 10), 0.00001);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0.6, solution.new21Game(6, 1, 10), 0.00001);
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(0.73278, solution.new21Game(21, 17, 10), 0.00001);
  }
}
