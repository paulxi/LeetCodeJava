package com.leetcode.algorithm.medium.sumofsubarrayminimums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(17, solution.sumSubarrayMins(new int[] {3, 1, 2, 4}));
  }
}
