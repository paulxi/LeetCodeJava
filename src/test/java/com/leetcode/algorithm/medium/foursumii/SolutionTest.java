package com.leetcode.algorithm.medium.foursumii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.fourSumCount(
        new int[]{1, 2},
        new int[]{-2, -1},
        new int[]{-1, 2},
        new int[]{0, 2}));
  }
}
