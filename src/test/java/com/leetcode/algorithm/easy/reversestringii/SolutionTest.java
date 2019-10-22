package com.leetcode.algorithm.easy.reversestringii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("bacdfeg", solution.reverseStr("abcdefg", 2));
  }
}
