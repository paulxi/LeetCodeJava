package com.leetcode.algorithm.medium.nextgreaterelementii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {2, -1, 2}, solution.nextGreaterElements(new int[] {1, 2, 1}));
  }
}
