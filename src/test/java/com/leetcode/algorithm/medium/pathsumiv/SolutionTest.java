package com.leetcode.algorithm.medium.pathsumiv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(12, solution.pathSum(new int[] {113, 215, 221}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(4, solution.pathSum(new int[] {113, 221}));
  }
}
