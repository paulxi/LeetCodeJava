package com.leetcode.algorithm.medium.candycrush;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[][] {
          {0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0},
          {110, 0, 0, 0, 114},
          {210, 0, 0, 0, 214},
          {310, 0, 0, 113, 314},
          {410, 0, 0, 213, 414},
          {610, 211, 112, 313, 614},
          {710, 311, 412, 613, 714},
          {810, 411, 512, 713, 1014}
        },
        solution.candyCrush(
            new int[][] {
              {110, 5, 112, 113, 114},
              {210, 211, 5, 213, 214},
              {310, 311, 3, 313, 314},
              {410, 411, 412, 5, 414},
              {5, 1, 512, 3, 3},
              {610, 4, 1, 613, 614},
              {710, 1, 2, 713, 714},
              {810, 1, 2, 1, 1},
              {1, 1, 2, 2, 2},
              {4, 1, 4, 4, 1014}
            }));
  }
}
