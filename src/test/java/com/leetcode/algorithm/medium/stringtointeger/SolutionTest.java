package com.leetcode.algorithm.medium.stringtointeger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(42, solution.myAtoi("42"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-42, solution.myAtoi("   -42"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(4193, solution.myAtoi("4193 with words"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(0, solution.myAtoi("words and 987"));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals(-2147483648, solution.myAtoi("-91283472332"));
  }
}
