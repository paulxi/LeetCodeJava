package com.leetcode.algorithm.easy.mergesortedarray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
    int[] nums2 = new int[] {2, 5, 6};
    solution.merge(nums1, 3, nums2, 3);

    assertArrayEquals(new int[] {1, 2, 2, 3, 5, 6}, nums1);
  }
}
