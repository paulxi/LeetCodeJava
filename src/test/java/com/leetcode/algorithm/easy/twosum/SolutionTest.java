package com.leetcode.algorithm.easy.twosum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testTwoSum() {
    Solution solution = new Solution();
    assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{0, 1}, 1));
  }
}
