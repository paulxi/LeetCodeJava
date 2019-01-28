package com.leetcode.algorithm.easy.majorityelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.majorityElement(new int[] {3, 2, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
  }
}
