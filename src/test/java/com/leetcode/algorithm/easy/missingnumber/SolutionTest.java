package com.leetcode.algorithm.easy.missingnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.missingNumber(new int[] {3, 0, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(8, solution.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
  }
}
