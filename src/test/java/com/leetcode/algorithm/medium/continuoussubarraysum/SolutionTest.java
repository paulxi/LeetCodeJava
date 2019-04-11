package com.leetcode.algorithm.medium.continuoussubarraysum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true,
        solution.checkSubarraySum(new int[] {23, 2, 4, 6, 7}, 6));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true,
        solution.checkSubarraySum(new int[] {23, 2, 6, 4, 7}, 6));
  }
}
