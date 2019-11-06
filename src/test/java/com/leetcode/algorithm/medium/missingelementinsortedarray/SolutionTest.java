package com.leetcode.algorithm.medium.missingelementinsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.missingElement(new int[] {4, 7, 9, 10}, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(8, solution.missingElement(new int[] {4, 7, 9, 10}, 3));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(6, solution.missingElement(new int[] {1, 2, 4}, 3));
  }
}
