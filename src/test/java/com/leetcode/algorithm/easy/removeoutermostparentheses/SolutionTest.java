package com.leetcode.algorithm.easy.removeoutermostparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("()()()", solution.removeOuterParentheses("(()())(())"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("()()()()(())", solution.removeOuterParentheses("(()())(())(()(()))"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("", solution.removeOuterParentheses("()()"));
  }
}
