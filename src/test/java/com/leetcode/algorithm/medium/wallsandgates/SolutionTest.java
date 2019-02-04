package com.leetcode.algorithm.medium.wallsandgates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[][] params = new int[][] {
        {Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
        {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
        {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
        {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
    };
    solution.wallsAndGates(params);

    int[][] expected = new int[][] {
        {3, -1, 0, 1},
        {2, 2, 1, -1},
        {1, -1, 2, -1},
        {0, -1, 3, 4}
    };

    assertArrayEquals(expected, params);
  }
}
