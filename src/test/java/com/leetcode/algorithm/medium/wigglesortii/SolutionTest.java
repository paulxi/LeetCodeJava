package com.leetcode.algorithm.medium.wigglesortii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] nums = new int[] {1, 5, 1, 1, 6, 4};
    solution.wiggleSort(nums);
    assertEquals(
        true,
        Arrays.equals(new int[] {1, 5, 1, 6, 1, 4}, nums)
            || Arrays.equals(new int[] {1, 6, 1, 5, 1, 4}, nums));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    int[] nums = new int[] {1, 3, 2, 2, 3, 1};
    solution.wiggleSort(nums);
    assertArrayEquals(new int[] {2, 3, 1, 3, 1, 2}, nums);
  }
}
