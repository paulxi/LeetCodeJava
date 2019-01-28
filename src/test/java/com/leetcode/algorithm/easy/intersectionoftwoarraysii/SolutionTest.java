package com.leetcode.algorithm.easy.intersectionoftwoarraysii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {2, 2}, solution.intersect(new int[] {1, 2, 2, 1}, new int[] {2, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {4, 9}, solution.intersect(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4}));
  }
}
