package com.leetcode.algorithm.medium.wigglesort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] nums = new int[] {3,5,2,1,6,4};
    solution.wiggleSort(nums);
    assertArrayEquals(new int[] {3,5,1,6,2,4}, nums);
  }
}
