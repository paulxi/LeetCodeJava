package com.leetcode.algorithm.medium.capacitytoshippackages;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(15, solution.shipWithinDays(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(6, solution.shipWithinDays(new int[] {3, 2, 2, 4, 1, 4}, 3));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(3, solution.shipWithinDays(new int[] {1, 2, 3, 1, 1}, 4));
  }
}
