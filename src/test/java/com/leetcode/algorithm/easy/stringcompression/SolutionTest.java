package com.leetcode.algorithm.easy.stringcompression;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.compress(new char[] {'a','a','b','b','c','c','c'}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.compress(new char[] {'a'}));
  }
}
