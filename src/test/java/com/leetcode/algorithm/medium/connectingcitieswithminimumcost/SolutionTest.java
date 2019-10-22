package com.leetcode.algorithm.medium.connectingcitieswithminimumcost;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.minimumCost(3, new int[][] {{1, 2, 5}, {1, 3, 6}, {2, 3, 1}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.minimumCost(4, new int[][] {{1, 2, 3}, {3, 4, 4}}));
  }
}
