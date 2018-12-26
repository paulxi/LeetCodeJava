package com.leetcode.algorithm.medium.ternaryexpressionparser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("2", solution.parseTernary("T?2:3"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("4", solution.parseTernary("F?1:T?4:5"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("F", solution.parseTernary("T?T?F:5:3"));
  }
}
