package com.leetcode.algorithm.medium.partitionequalsubsetsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.canPartition(new int[] {1, 5, 11, 5}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.canPartition(new int[] {1, 2, 3, 5}));
  }
}
