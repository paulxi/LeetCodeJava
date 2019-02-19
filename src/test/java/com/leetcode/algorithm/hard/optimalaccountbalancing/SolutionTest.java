package com.leetcode.algorithm.hard.optimalaccountbalancing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.minTransfers(new int[][] {
        {0, 1, 10}, {2, 0, 5}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.minTransfers(new int[][] {
        {0, 1, 10}, {1, 0, 1}, {1, 2, 5}, {2, 0, 5}
    }));
  }
}
