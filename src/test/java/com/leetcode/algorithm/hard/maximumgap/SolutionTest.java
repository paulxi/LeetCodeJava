package com.leetcode.algorithm.hard.maximumgap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.maximumGap(new int[] {3, 6, 9, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.maximumGap(new int[] {10}));
  }
}
