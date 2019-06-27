package com.leetcode.algorithm.medium.bitwiseandofnumbersrange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.rangeBitwiseAnd(5, 7));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.rangeBitwiseAnd(0, 1));
  }
}
