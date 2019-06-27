package com.leetcode.algorithm.medium.campusbikesii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        6, solution.assignBikes(new int[][] {{0, 0}, {2, 1}}, new int[][] {{1, 2}, {3, 3}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        4,
        solution.assignBikes(
            new int[][] {{0, 0}, {1, 1}, {2, 0}}, new int[][] {{1, 0}, {2, 2}, {2, 1}}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(
        6, solution.assignBikes2(new int[][] {{0, 0}, {2, 1}}, new int[][] {{1, 2}, {3, 3}}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(
        4,
        solution.assignBikes2(
            new int[][] {{0, 0}, {1, 1}, {2, 0}}, new int[][] {{1, 0}, {2, 2}, {2, 1}}));
  }
}
