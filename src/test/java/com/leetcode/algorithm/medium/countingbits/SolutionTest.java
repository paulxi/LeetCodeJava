package com.leetcode.algorithm.medium.countingbits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[]{0,1,1,2,1,2}, solution.countBits(5));
  }
}
