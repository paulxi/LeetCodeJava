package com.leetcode.algorithm.medium.caniwin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(false, solution.canIWin(10, 11));
  }
}
