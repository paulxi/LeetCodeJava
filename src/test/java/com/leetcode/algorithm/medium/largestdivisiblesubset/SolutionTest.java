package com.leetcode.algorithm.medium.largestdivisiblesubset;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1, 2), solution.largestDivisibleSubset(new int[] {1, 2, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(1, 2, 4, 8), solution.largestDivisibleSubset(new int[] {1, 2, 4, 8}));
  }
}
