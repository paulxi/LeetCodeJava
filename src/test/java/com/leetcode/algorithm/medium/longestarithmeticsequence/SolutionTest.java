package com.leetcode.algorithm.medium.longestarithmeticsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.longestArithSeqLength(new int[] {3, 6, 9, 12}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.longestArithSeqLength(new int[] {9, 4, 7, 2, 10}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(4, solution.longestArithSeqLength(new int[] {20, 1, 15, 3, 10, 5, 8}));
  }
}
