package com.leetcode.algorithm.medium.imageoverlap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        3,
        solution.largestOverlap(
            new int[][] {{1, 1, 0}, {0, 1, 0}, {0, 1, 0}},
            new int[][] {{0, 0, 0}, {0, 1, 1}, {0, 0, 1}}));
  }
}
