package com.leetcode.algorithm.easy.twosumii;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testTwoSumOk() {
    Solution solution = new Solution();
    assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
  }
}
