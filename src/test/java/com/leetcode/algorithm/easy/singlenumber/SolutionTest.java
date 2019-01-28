package com.leetcode.algorithm.easy.singlenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.singleNumber(new int[] {2, 2, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(4, solution.singleNumber(new int[] {4, 1, 2, 1, 2}));
  }
}
