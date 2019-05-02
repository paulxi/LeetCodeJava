package com.leetcode.algorithm.easy.thirdmaximumnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.thirdMax(new int[] {3, 2, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.thirdMax(new int[] {1, 2}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.thirdMax(new int[] {2, 2, 3, 1}));
  }
}
