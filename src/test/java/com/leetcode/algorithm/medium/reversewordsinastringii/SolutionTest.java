package com.leetcode.algorithm.medium.reversewordsinastringii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    char[] input = new char[] {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
    char[] expected = new char[] {'b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e'};
    solution.reverseWords(input);
    assertArrayEquals(expected, input);
  }
}
