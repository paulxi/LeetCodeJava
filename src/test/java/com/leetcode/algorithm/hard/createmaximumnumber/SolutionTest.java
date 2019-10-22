package com.leetcode.algorithm.hard.createmaximumnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {9, 8, 6, 5, 3},
        solution.maxNumber(new int[] {3, 4, 6, 5}, new int[] {9, 1, 2, 5, 8, 3}, 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {6, 7, 6, 0, 4}, solution.maxNumber(new int[] {6, 7}, new int[] {6, 0, 4}, 5));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {9, 8, 9}, solution.maxNumber(new int[] {3, 9}, new int[] {8, 9}, 3));
  }
}
