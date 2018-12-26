package com.leetcode.algorithm.medium.topkfrequentelements;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1, 2), solution.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1), solution.topKFrequent(new int[] {1}, 1));
  }
}
