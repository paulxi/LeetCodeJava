package com.leetcode.algorithm.hard.busroutes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(2, solution.numBusesToDestination(new int[][] {
        {1, 2, 7}, {3, 6, 7}
    }, 1, 6));
  }
}
