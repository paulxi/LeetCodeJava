package com.leetcode.algorithm.hard.remove9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(10, solution.newInteger(9));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(10, solution.newInteger2(9));
  }
}
