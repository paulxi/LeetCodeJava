package com.leetcode.algorithm.medium.bombenemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(3, solution.maxKilledEnemies(new char[][] {
        {'0','E','0','0'},
        {'E','0','W','E'},
        {'0','E','0','0'}
    }));
  }
}
