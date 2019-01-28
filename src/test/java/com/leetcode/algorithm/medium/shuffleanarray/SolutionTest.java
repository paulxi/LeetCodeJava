package com.leetcode.algorithm.medium.shuffleanarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    int[] nums = new int[] {1, 2, 3};
    Solution solution = new Solution(nums);
    assertArrayEquals(nums, solution.shuffle());
    nums = solution.reset();
    assertArrayEquals(new int[] {1, 2, 3}, nums);
    assertArrayEquals(nums, solution.shuffle());
  }
}
