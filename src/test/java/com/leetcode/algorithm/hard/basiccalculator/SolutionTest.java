package com.leetcode.algorithm.hard.basiccalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(2, solution.calculate("1 + 1"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(3, solution.calculate(" 2-1 + 2 "));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals(23, solution.calculate("(1+(4+5+2)-3)+(6+8)"));
  }
}
