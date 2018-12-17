package com.leetcode.algorithm.medium.partitiontokequalsumsubsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.canPartitionKSubsets(new int[] {4, 3, 2, 3, 5, 2, 1}, 4));
  }
}
