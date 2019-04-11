package com.leetcode.algorithm.medium.hindex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.hIndex(new int[] {3, 0, 6, 1, 5}));
  }
}
