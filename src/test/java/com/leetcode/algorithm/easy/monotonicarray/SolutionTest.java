package com.leetcode.algorithm.easy.monotonicarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isMonotonic(new int[] {1, 2, 2, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.isMonotonic(new int[] {6, 5, 4, 4}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(false, solution.isMonotonic(new int[] {1, 3, 2}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(true, solution.isMonotonic(new int[] {1, 2, 4, 5}));
  }
}
