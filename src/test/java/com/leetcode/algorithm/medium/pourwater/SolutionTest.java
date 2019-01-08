package com.leetcode.algorithm.medium.pourwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {2, 2, 2, 3, 2, 2, 2}, solution.pourWater(new int[] {2, 1, 1, 2, 1, 2, 2}, 4, 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {2, 3, 3, 4}, solution.pourWater(new int[] {1, 2, 3, 4}, 2, 2));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {4, 4, 4}, solution.pourWater(new int[] {3, 1, 3}, 5, 1));
  }
}
