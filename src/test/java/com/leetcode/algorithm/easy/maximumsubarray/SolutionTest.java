package com.leetcode.algorithm.easy.maximumsubarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.maxSubArray(new int[] {1}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(-1, solution.maxSubArray(new int[] {-2, -1}));
  }
}
