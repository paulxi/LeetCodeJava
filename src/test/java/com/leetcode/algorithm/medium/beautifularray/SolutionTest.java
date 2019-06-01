package com.leetcode.algorithm.medium.beautifularray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {1, 3, 2, 4}, solution.beautifulArray(4));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {1, 5, 3, 2, 4}, solution.beautifulArray(5));
  }
}
