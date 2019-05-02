package com.leetcode.algorithm.easy.heaters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.findRadius(new int[] {1, 2, 3}, new int[] {2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.findRadius(new int[] {1, 2, 3, 4}, new int[] {1, 4}));
  }
}
