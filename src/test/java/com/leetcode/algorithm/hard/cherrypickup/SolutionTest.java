package com.leetcode.algorithm.hard.cherrypickup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(5, solution.cherryPickup(new int[][] {
        {0, 1, -1},
        {1, 0, -1},
        {1, 1,  1}
    }));
  }
}
