package com.leetcode.algorithm.medium.containerwithmostwater;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(49,
        solution.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
  }
}
