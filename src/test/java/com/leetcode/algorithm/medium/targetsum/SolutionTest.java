package com.leetcode.algorithm.medium.targetsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.findTargetSumWays(new int[] {1, 1, 1, 1, 1}, 3));
  }
}
