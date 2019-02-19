package com.leetcode.algorithm.medium.validparenthesisstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.checkValidString("()"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.checkValidString("(*)"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(true, solution.checkValidString("(*))"));
  }
}
