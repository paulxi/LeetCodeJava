package com.leetcode.algorithm.medium.totalhammingdistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.totalHammingDistance(new int[] {4, 14, 2}));
  }
}
