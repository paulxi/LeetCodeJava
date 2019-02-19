package com.leetcode.algorithm.hard.reachingpoints;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.reachingPoints(1, 1, 3, 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.reachingPoints(1, 1, 2, 2));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(true, solution.reachingPoints(1, 1, 1, 1));
  }
}
