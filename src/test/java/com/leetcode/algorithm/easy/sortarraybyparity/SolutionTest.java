package com.leetcode.algorithm.easy.sortarraybyparity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {4, 2, 1, 3}, solution.sortArrayByParity(new int[] {3, 1, 2, 4}));
  }
}
