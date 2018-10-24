package com.leetcode.algorithm.medium.gameoflife;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[][] params = new int[][] {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
    int[][] expected = new int[][] {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
    solution.gameOfLife(params);
    assertArrayEquals(expected[0], params[0]);
    assertArrayEquals(expected[1], params[1]);
    assertArrayEquals(expected[2], params[2]);
    assertArrayEquals(expected[3], params[3]);
  }
}
