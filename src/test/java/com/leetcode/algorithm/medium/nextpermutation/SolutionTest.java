package com.leetcode.algorithm.medium.nextpermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] nums = new int[] {1, 2, 3};
    solution.nextPermutation(nums);
    assertArrayEquals(new int[] {1, 3, 2}, nums);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    int[] nums = new int[] {3, 2, 1};
    solution.nextPermutation(nums);
    assertArrayEquals(new int[] {1, 2, 3}, nums);
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    int[] nums = new int[] {1, 1, 5};
    solution.nextPermutation(nums);
    assertArrayEquals(new int[] {1, 5, 1}, nums);
  }
}
