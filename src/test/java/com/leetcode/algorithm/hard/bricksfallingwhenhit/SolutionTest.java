package com.leetcode.algorithm.hard.bricksfallingwhenhit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {2},
        solution.hitBricks(new int[][] {{1, 0, 0, 0}, {1, 1, 1, 0}}, new int[][] {{1, 0}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {0, 0},
        solution.hitBricks(new int[][] {{1, 0, 0, 0}, {1, 1, 0, 0}}, new int[][] {{1, 1}, {1, 0}}));
  }
}
