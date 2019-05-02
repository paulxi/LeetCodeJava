package com.leetcode.algorithm.easy.nondecreasingarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.checkPossibility(new int[] {4, 2, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.checkPossibility(new int[] {4, 3, 2}));
  }
}
