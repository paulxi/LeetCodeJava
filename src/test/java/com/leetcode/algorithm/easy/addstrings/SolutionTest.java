package com.leetcode.algorithm.easy.addstrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("210", solution.addStrings("99", "111"));
  }
}
