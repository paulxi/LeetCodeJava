package com.leetcode.algorithm.medium.evaluatereversepolishnotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(9, solution.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(6, solution.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals(22, solution.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
  }
}
