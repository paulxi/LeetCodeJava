package com.leetcode.algorithm.medium.courseschedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.canFinish(2, new int[][] {{1, 0}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.canFinish(2, new int[][] {{1, 0}, {0, 1}}));
  }
}
