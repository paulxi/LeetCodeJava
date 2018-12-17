package com.leetcode.algorithm.medium.findfirstandlastpositionofelementinsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {3, 4}, solution.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {-1, -1}, solution.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 6));
  }
}
