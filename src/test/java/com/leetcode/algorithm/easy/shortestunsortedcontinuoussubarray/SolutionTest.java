package com.leetcode.algorithm.easy.shortestunsortedcontinuoussubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.findUnsortedSubarray(new int[] {2, 1}));
  }
}
