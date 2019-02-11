package com.leetcode.algorithm.hard.profitableschemes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.profitableSchemes(5, 3, new int[] {2, 2}, new int[] {2, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(7, solution.profitableSchemes(10, 5, new int[] {2, 3, 5}, new int[] {6, 7, 8}));
  }
}
