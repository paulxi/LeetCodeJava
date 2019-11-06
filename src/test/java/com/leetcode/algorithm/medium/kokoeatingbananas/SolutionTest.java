package com.leetcode.algorithm.medium.kokoeatingbananas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.minEatingSpeed(new int[] {3,6,7,11}, 8));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(30, solution.minEatingSpeed(new int[] {30,11,23,4,20}, 5));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(23, solution.minEatingSpeed(new int[] {30,11,23,4,20}, 6));
  }
}
