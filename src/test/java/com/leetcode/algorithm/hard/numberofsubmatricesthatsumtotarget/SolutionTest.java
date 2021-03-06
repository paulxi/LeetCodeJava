package com.leetcode.algorithm.hard.numberofsubmatricesthatsumtotarget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        4, solution.numSubmatrixSumTarget(new int[][] {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, 0));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(5, solution.numSubmatrixSumTarget(new int[][] {{1, -1}, {-1, 1}}, 0));
  }
}
