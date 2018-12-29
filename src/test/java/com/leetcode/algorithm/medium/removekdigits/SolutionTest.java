package com.leetcode.algorithm.medium.removekdigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("1219", solution.removeKdigits("1432219", 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("200", solution.removeKdigits("10200", 1));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("0", solution.removeKdigits("10", 2));
  }
}
