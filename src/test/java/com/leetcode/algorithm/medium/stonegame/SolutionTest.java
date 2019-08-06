package com.leetcode.algorithm.medium.stonegame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.stoneGame(new int[] {5, 3, 4, 5}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.stoneGame2(new int[] {5, 3, 4, 5}));
  }
}
