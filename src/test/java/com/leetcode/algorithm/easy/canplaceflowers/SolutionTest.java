package com.leetcode.algorithm.easy.canplaceflowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2));
  }
}
