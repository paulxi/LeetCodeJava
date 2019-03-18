package com.leetcode.algorithm.easy.degreeofanarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.findShortestSubArray(new int[] {1, 2, 2, 3, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(6, solution.findShortestSubArray(new int[] {1,2,2,3,1,4,2}));
  }
}
