package com.leetcode.algorithm.medium.minimumremovetomakevalidparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("lee(t(c)o)de", solution.minRemoveToMakeValid("lee(t(c)o)de)"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("ab(c)d", solution.minRemoveToMakeValid("a)b(c)d"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("", solution.minRemoveToMakeValid("))(("));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals("a(b(c)d)", solution.minRemoveToMakeValid("(a(b(c)d)"));
  }
}
