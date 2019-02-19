package com.leetcode.algorithm.medium.searchinrotatedsortedarrayii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true,
        solution.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 0));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false,
        solution.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 3));
  }
}
