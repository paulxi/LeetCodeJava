package com.leetcode.algorithm.medium.kthmostfrequent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.findKthMost(new int[] {1, 1, 1, 1, 2, 2, 2, 3, 3}, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.findKthMost(new int[] {1, 2, 3, 2, 2, 2, 2, 3}, 2));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(5, solution.findKthMost(new int[] {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5}, 4));
  }
}
