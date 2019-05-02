package com.leetcode.algorithm.medium.validsquare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        true,
        solution.validSquare(
            new int[] {0, 0}, new int[] {1, 1}, new int[] {1, 0}, new int[] {0, 1}));
  }
}
