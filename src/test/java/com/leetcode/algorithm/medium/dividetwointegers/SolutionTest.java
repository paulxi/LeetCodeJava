package com.leetcode.algorithm.medium.dividetwointegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.divide(10, 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-2, solution.divide(7, -3));
  }
}
