package com.leetcode.algorithm.easy.floodfill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[][] {
        {2, 2, 2}, {2, 2, 0}, {2, 0, 1}
    }, solution.floodFill(new int[][] {
        {1, 1, 1}, {1, 1, 0}, {1, 0, 1}
    }, 1, 1, 2));
  }
}
