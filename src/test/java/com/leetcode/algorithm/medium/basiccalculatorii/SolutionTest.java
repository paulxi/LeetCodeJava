package com.leetcode.algorithm.medium.basiccalculatorii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(7, solution.calculate("3+2*2"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.calculate(" 3/2 "));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(5, solution.calculate(" 3+5 / 2 "));
  }
}
