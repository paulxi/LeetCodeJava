package com.leetcode.algorithm.easy.magicsquaresingrid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        1,
        solution.numMagicSquaresInside(
            new int[][] {
              {4, 3, 8, 4},
              {9, 5, 1, 9},
              {2, 7, 6, 2}
            }));
  }
}
