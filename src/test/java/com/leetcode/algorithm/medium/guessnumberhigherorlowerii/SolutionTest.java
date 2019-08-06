package com.leetcode.algorithm.medium.guessnumberhigherorlowerii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(16, solution.getMoneyAmount(10));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(16, solution.getMoneyAmount2(10));
  }
}
