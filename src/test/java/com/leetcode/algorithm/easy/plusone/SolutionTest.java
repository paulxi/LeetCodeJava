package com.leetcode.algorithm.easy.plusone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {1, 2, 4}, solution.plusOne(new int[] {1, 2, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {4, 3, 2, 2}, solution.plusOne(new int[] {4, 3, 2, 1}));
  }
}
