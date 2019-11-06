package com.leetcode.algorithm.medium.maximumsumoftwononoverlappingsubarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(20, solution.maxSumTwoNoOverlap(new int[] {0, 6, 5, 2, 2, 5, 1, 9, 4}, 1, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(29, solution.maxSumTwoNoOverlap(new int[] {3, 8, 1, 3, 2, 1, 8, 9, 0}, 3, 2));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(31, solution.maxSumTwoNoOverlap(new int[] {2, 1, 5, 6, 0, 9, 5, 0, 3, 8}, 4, 3));
  }
}
