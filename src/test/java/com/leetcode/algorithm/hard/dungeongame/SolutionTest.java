package com.leetcode.algorithm.hard.dungeongame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(7, solution.calculateMinimumHP(new int[][] {
        {-2, -3, 3},
        {-5, -10, 1},
        {10, 30, -5}
    }));
  }
}
