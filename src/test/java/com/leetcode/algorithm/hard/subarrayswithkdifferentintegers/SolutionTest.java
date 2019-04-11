package com.leetcode.algorithm.hard.subarrayswithkdifferentintegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(7, solution.subarraysWithKDistinct(new int[] {1, 2, 1, 2, 3}, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.subarraysWithKDistinct(new int[] {1, 2, 1, 3, 4}, 3));
  }
}
