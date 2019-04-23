package com.leetcode.algorithm.medium.minimumheighttrees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(1),
        solution.findMinHeightTrees(
            4,
            new int[][] {
              {1, 0},
              {1, 2},
              {1, 3}
            }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(3, 4),
        solution.findMinHeightTrees(
            6,
            new int[][] {
              {0, 3},
              {1, 3},
              {2, 3},
              {4, 3},
              {5, 4}
            }));
  }
}
