package com.leetcode.algorithm.medium.boatstosavepeople;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.numRescueBoats(new int[] {1, 2}, 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.numRescueBoats(new int[] {3,2,2,1}, 3));
  }
}
