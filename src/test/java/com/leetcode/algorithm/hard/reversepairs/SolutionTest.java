package com.leetcode.algorithm.hard.reversepairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.reversePairs(new int[] {1, 3, 2, 3, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.reversePairs(new int[] {2, 4, 3, 5, 1}));
  }
}
