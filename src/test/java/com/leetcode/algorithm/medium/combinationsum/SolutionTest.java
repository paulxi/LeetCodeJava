package com.leetcode.algorithm.medium.combinationsum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(7)),
        solution.combinationSum(new int[] {2, 3, 6, 7}, 7));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(2, 3, 3), Arrays.asList(3, 5)),
        solution.combinationSum(new int[] {2, 3, 5}, 8));
  }
}
