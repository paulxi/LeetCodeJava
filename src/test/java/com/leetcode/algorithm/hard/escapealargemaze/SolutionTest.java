package com.leetcode.algorithm.hard.escapealargemaze;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        false,
        solution.isEscapePossible(
            new int[][] {{0, 1}, {1, 0}}, new int[] {0, 0}, new int[] {0, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        true,
        solution.isEscapePossible(new int[][] {}, new int[] {0, 0}, new int[] {999999, 999999}));
  }
}
