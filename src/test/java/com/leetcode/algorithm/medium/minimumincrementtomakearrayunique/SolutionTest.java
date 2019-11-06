package com.leetcode.algorithm.medium.minimumincrementtomakearrayunique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.minIncrementForUnique(new int[] {1, 2, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(6, solution.minIncrementForUnique(new int[] {3, 2, 1, 2, 1, 7}));
  }
}
