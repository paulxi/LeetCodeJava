package com.leetcode.algorithm.medium.utf8validation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.validUtf8(new int[] {197, 130, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.validUtf8(new int[] {235, 140, 4}));
  }
}
