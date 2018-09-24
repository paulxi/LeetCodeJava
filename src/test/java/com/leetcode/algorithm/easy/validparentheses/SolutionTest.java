package com.leetcode.algorithm.easy.validparentheses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertTrue(solution.isValid("()"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertTrue(solution.isValid("()[]{}"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertFalse(solution.isValid("(]"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertFalse(solution.isValid("([)]"));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertTrue(solution.isValid("{[]}"));
  }
}
