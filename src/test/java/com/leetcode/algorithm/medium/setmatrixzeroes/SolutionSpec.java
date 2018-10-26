package com.leetcode.algorithm.medium.setmatrixzeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionSpec {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[][] params = new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int[][] expected = new int[][] {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
    solution.setZeroes(params);
    assertArrayEquals(expected[0], params[0]);
    assertArrayEquals(expected[1], params[1]);
    assertArrayEquals(expected[2], params[2]);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    int[][] params = new int[][] {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    int[][] expected = new int[][] {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
    solution.setZeroes(params);
    assertArrayEquals(expected[0], params[0]);
    assertArrayEquals(expected[1], params[1]);
    assertArrayEquals(expected[2], params[2]);
  }
}
