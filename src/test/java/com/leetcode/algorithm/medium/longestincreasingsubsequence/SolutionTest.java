package com.leetcode.algorithm.medium.longestincreasingsubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {2, 3, 7, 18}, solution.arrayOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {-1, 2, 3, 7, 9, 10},
        solution.arrayOfLIS(new int[] {3, 4, -1, 5, 8, 2, 3, 12, 7, 9, 10}));
  }
}
