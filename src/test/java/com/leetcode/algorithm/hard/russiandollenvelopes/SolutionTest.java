package com.leetcode.algorithm.hard.russiandollenvelopes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.maxEnvelopes(new int[][] {
        {5, 4}, {6, 4}, {6, 7}, {2, 3}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.maxEnvelopes2(new int[][] {
        {5, 4}, {6, 4}, {6, 7}, {2, 3}
    }));
  }
}
