package com.leetcode.algorithm.easy.twocityscheduling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testTwoSumOk() {
    Solution solution = new Solution();
    assertEquals(
        110, solution.twoCitySchedCost(new int[][] {{10, 20}, {30, 200}, {400, 50}, {30, 20}}));
  }
}
