package com.leetcode.algorithm.medium.findpermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {1, 2}, solution.findPermutation("I"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {2, 1, 3}, solution.findPermutation("DI"));
  }
}
