package com.leetcode.algorithm.medium.deleteandearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.deleteAndEarn(new int[] {3, 4, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(9, solution.deleteAndEarn(new int[] {2, 2, 3, 3, 3, 4}));
  }
}
