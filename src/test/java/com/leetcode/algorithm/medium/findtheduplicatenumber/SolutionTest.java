package com.leetcode.algorithm.medium.findtheduplicatenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(2, solution.findDuplicate(new int[] {1, 3, 4, 2, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(3, solution.findDuplicate(new int[] {3, 1, 3, 4, 2}));
  }
}
