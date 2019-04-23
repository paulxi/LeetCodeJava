package com.leetcode.algorithm.medium.waterandjugproblem;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertTrue(solution.canMeasureWater(3, 5, 4));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertFalse(solution.canMeasureWater(2, 6, 5));
  }
}
