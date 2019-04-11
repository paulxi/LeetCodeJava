package com.leetcode.algorithm.hard.swiminrisingwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        3,
        solution.swimInWater(
            new int[][] {
              {0, 2},
              {1, 3}
            }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        16,
        solution.swimInWater(
            new int[][] {
              {0, 1, 2, 3, 4},
              {24, 23, 22, 21, 5},
              {12, 13, 14, 15, 16},
              {11, 17, 18, 19, 20},
              {10, 9, 8, 7, 6}
            }));
  }
}
