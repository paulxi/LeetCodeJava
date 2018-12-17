package com.leetcode.algorithm.hard.burstballoons;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(167, solution.maxCoins(new int[] {3,1,5,8}));
  }
}
