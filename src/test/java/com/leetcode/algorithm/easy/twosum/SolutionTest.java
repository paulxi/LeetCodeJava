package com.leetcode.algorithm.easy.twosum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testTwoSumOk() {
    Solution solution = new Solution();
    assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
  }

  @Test
  public void testTwoSumEmptyNums() {
    Solution solution = new Solution();
    assertArrayEquals(new int[0], solution.twoSum(new int[0], 9));
  }

  @Test
  public void testTwoSumNotFound() {
    Solution solution = new Solution();
    assertArrayEquals(new int[0], solution.twoSum(new int[]{2, 11, 15}, 9));
  }
}
