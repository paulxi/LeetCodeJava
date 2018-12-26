package com.leetcode.algorithm.hard.firstmissingpositive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.firstMissingPositive(new int[] {1, 2, 0}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.firstMissingPositive(new int[] {3, 4, -1, 1}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.firstMissingPositive(new int[] {7, 8, 9, 11, 12}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(2, solution.firstMissingPositive(new int[] {1, 1}));
  }
}
