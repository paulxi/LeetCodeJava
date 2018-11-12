package com.leetcode.algorithm.medium.kthlargestelementinanarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] input = {3, 2, 1, 5, 6, 4};
    assertEquals(5, solution.findKthLargest(input, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    int[] input = {3, 2, 3, 1, 2, 4, 5, 5, 6};
    assertEquals(4, solution.findKthLargest(input, 4));
  }
}
