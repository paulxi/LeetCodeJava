package com.leetcode.algorithm.medium.splitarrayintoconsecutivesubsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isPossible(new int[] {1, 2, 3, 3, 4, 5}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.isPossible(new int[] {1, 2, 3, 3, 4, 4, 5, 5}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(false, solution.isPossible(new int[] {1, 2, 3, 4, 4, 5}));
  }
}
