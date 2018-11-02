package com.leetcode.algorithm.easy.addbinary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("100", solution.addBinary("11", "1"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("10101", solution.addBinary("1010", "1011"));
  }
}
