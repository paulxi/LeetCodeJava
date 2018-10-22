package com.leetcode.algorithm.medium.generateparentheses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(new HashSet<>(Arrays.asList(
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()"
    )), new HashSet<>(solution.generateParenthesis(3)));
  }
}
