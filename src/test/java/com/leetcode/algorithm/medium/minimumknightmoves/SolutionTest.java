package com.leetcode.algorithm.medium.minimumknightmoves;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1,
        solution.minKnightMoves(2, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(4,
        solution.minKnightMoves(5, 5));
  }
}
