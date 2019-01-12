package com.leetcode.algorithm.medium.combinationsumii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(Arrays.asList(1, 1, 6), Arrays.asList(1, 2, 5), Arrays.asList(1, 7), Arrays.asList(2, 6)),
        solution.combinationSum2(new int[] {10, 1, 2, 7, 6, 1, 5}, 8));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(Arrays.asList(1, 2, 2), Arrays.asList(5)),
        solution.combinationSum2(new int[] {2, 5, 2, 1, 2}, 5));
  }
}
