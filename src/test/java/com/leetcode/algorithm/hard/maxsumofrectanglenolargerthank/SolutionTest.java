package com.leetcode.algorithm.hard.maxsumofrectanglenolargerthank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.maxSumSubmatrix(new int[][] {{1, 0, 1}, {0, -2, 3}}, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.maxSumSubmatrix(new int[][] {{2, 2, -1}}, 2));
  }
}
