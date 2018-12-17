package com.leetcode.algorithm.medium.randompickwithweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution(new int[]{1});
    assertEquals(0, solution.pickIndex());
  }
}
