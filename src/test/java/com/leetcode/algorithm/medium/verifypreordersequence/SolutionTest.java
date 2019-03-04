package com.leetcode.algorithm.medium.verifypreordersequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(false, solution.verifyPreorder(new int[] {5,2,6,1,3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.verifyPreorder(new int[] {5,2,1,3,6}));
  }
}
