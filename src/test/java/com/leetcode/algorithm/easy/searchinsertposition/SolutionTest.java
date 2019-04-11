package com.leetcode.algorithm.easy.searchinsertposition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] nums = {1,3,5,6};
    assertEquals(2, solution.searchInsert(nums, 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    int[] nums = {1,3,5,6};
    assertEquals(1, solution.searchInsert(nums, 2));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    int[] nums = {1,3,5,6};
    assertEquals(4, solution.searchInsert(nums, 7));
  }
}
