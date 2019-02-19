package com.leetcode.algorithm.hard.themazeiii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("lul", solution.findShortestWay(new int[][] {
        {0, 0, 0, 0, 0},
        {1, 1, 0, 0, 1},
        {0, 0, 0, 0, 0},
        {0, 1, 0, 0, 1},
        {0, 1, 0, 0, 0}
    }, new int[] {4, 3}, new int[] {0, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("impossible", solution.findShortestWay(new int[][] {
        {0, 0, 0, 0, 0},
        {1, 1, 0, 0, 1},
        {0, 0, 0, 0, 0},
        {0, 1, 0, 0, 1},
        {0, 1, 0, 0, 0}
    }, new int[] {4, 3}, new int[] {3, 0}));
  }
}
