package com.leetcode.algorithm.medium.kthsmallestelementinasortedmatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(13, solution.kthSmallest(new int[][] {
        { 1,  5,  9},
        {10, 11, 13},
        {12, 13, 15}
    }, 8));
  }
}
