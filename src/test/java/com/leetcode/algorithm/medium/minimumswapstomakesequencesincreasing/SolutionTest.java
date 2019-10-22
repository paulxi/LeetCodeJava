package com.leetcode.algorithm.medium.minimumswapstomakesequencesincreasing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.minSwap(new int[] {1, 3, 5, 4}, new int[] {1, 2, 3, 7}));
  }
}
