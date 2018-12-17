package com.leetcode.algorithm.medium.maximumxoroftwonumbersinanarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(28, solution.findMaximumXOR(new int[] {3, 10, 5, 25, 2, 8}));
  }
}
