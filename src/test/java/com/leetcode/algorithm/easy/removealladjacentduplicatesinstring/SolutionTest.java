package com.leetcode.algorithm.easy.removealladjacentduplicatesinstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("ca", solution.removeDuplicates("abbaca"));
  }
}
