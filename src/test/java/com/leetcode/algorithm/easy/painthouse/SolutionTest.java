package com.leetcode.algorithm.easy.painthouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(10, solution.minCost(new int[][] {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}}));
  }
}
