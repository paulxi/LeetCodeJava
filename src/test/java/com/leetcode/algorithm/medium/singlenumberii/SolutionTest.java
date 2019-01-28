package com.leetcode.algorithm.medium.singlenumberii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.singleNumber(new int[] {2, 2, 3, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(99, solution.singleNumber(new int[] {0, 1, 0, 1, 0, 1, 99}));
  }
}
