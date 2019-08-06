package com.leetcode.algorithm.medium.videostitching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        3,
        solution.videoStitching(new int[][] {{0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}}, 10));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.videoStitching(new int[][] {{0, 1}, {1, 2}}, 5));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(
        3,
        solution.videoStitching(
            new int[][] {
              {0, 1}, {6, 8}, {0, 2}, {5, 6}, {0, 4}, {0, 3}, {6, 7}, {1, 3}, {4, 7}, {1, 4},
              {2, 5}, {2, 6}, {3, 4}, {4, 5}, {5, 7}, {6, 9}
            },
            9));
  }
}
