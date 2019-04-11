package com.leetcode.algorithm.medium.mindominorotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        2, solution.minDominoRotations(new int[] {2, 1, 2, 4, 2, 2}, new int[] {5, 2, 6, 2, 3, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        -1, solution.minDominoRotations(new int[] {3, 5, 1, 2, 3}, new int[] {3, 6, 3, 3, 4}));
  }
}
