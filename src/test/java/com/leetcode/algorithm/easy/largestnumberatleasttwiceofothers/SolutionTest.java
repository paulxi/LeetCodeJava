package com.leetcode.algorithm.easy.largestnumberatleasttwiceofothers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.dominantIndex(new int[] {3, 6, 1, 0}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.dominantIndex(new int[] {1, 2, 3, 4}));
  }
}
