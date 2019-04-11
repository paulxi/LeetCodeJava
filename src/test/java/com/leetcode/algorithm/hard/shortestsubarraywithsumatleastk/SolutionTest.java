package com.leetcode.algorithm.hard.shortestsubarraywithsumatleastk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.shortestSubarray(new int[] {1}, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.shortestSubarray(new int[] {1, 2}, 4));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(3, solution.shortestSubarray(new int[] {2, -1, 2}, 3));
  }
}
