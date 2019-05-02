package com.leetcode.algorithm.medium.champagnetower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(0, solution.champagneTower(1, 1, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0.5, solution.champagneTower(2, 1, 1));
  }
}
