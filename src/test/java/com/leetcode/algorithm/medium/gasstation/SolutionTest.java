package com.leetcode.algorithm.medium.gasstation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.canCompleteCircuit(new int[] {1, 2, 3, 4, 5},
        new int[] {3, 4, 5, 1, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.canCompleteCircuit(new int[] {2, 3, 4},
        new int[] {3, 4, 3}));
  }
}
