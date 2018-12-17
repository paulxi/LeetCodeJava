package com.leetcode.algorithm.easy.validperfectsquare;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertTrue(solution.isPerfectSquare(16));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertFalse(solution.isPerfectSquare(14));
  }
}
