package com.leetcode.algorithm.medium.knightprobability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(0.0625, solution.knightProbability(3, 2, 0, 0), 0.001);
  }
}
