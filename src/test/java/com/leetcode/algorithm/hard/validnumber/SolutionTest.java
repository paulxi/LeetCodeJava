package com.leetcode.algorithm.hard.validnumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(true, solution.isNumber("0"));
    assertEquals(true, solution.isNumber(" 0.1 "));
    assertEquals(false, solution.isNumber("abc"));
    assertEquals(false, solution.isNumber("1 a"));
    assertEquals(true, solution.isNumber("2e10"));
    assertEquals(true, solution.isNumber(" -90e3   "));
    assertEquals(false, solution.isNumber("1e"));
    assertEquals(false, solution.isNumber("e3"));
    assertEquals(true, solution.isNumber(" 6e-1"));
    assertEquals(false, solution.isNumber(" 99e2.5 "));
    assertEquals(true, solution.isNumber("53.5e93"));
    assertEquals(false, solution.isNumber(" --6 "));
    assertEquals(false, solution.isNumber("-+3"));
    assertEquals(false, solution.isNumber("95a54e53"));
  }
}
