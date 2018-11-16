package com.leetcode.algorithm.medium.multiplystrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals("6", solution.multiply("2", "3"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals("56088", solution.multiply("123", "456"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals("121932631112635269", solution.multiply("123456789", "987654321"));
  }
}
