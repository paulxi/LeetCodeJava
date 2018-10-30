package com.leetcode.algorithm.hard.removeinvalidparentheses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    Set<String> expected = new HashSet(Arrays.asList("()()()", "(())()"));
    assertEquals(expected, new HashSet<String>(solution.removeInvalidParentheses("()())()")));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    Set<String> expected = new HashSet(Arrays.asList("(a)()()", "(a())()"));
    assertEquals(expected, new HashSet<String>(solution.removeInvalidParentheses("(a)())()")));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    Set<String> expected = new HashSet(Arrays.asList(""));
    assertEquals(expected, new HashSet<String>(solution.removeInvalidParentheses(")(")));
  }
}
