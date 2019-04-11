package com.leetcode.algorithm.medium.customsortstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("cbad", solution.customSortString("cba", "abcd"));
  }
}
