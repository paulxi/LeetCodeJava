package com.leetcode.algorithm.hard.splitarraywithsamevverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.splitArraySameAverage(new int[] {1, 2, 3, 4, 5, 6, 7, 8}));
  }
}
