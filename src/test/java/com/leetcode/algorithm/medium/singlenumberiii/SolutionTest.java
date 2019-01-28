package com.leetcode.algorithm.medium.singlenumberiii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {5, 3}, solution.singleNumber(new int[] {1, 2, 1, 3, 2, 5}));
  }
}
