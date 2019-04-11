package com.leetcode.algorithm.easy.pairsofsongswithtotaldurations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.numPairsDivisibleBy60(new int[] {30, 20, 150, 100, 40}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.numPairsDivisibleBy60(new int[] {60, 60, 60}));
  }
}
