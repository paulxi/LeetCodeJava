package com.leetcode.algorithm.medium.predictthewinner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(false, solution.PredictTheWinner(new int[]{1, 5, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.PredictTheWinner(new int[]{1, 5, 233, 7}));
  }
}
