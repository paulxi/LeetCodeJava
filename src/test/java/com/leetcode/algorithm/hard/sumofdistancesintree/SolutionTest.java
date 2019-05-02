package com.leetcode.algorithm.hard.sumofdistancesintree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {8, 12, 6, 10, 10, 10},
        solution.sumOfDistancesInTree(6, new int[][] {{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}}));
  }
}
