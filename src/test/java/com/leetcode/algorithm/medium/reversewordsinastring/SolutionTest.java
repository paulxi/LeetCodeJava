package com.leetcode.algorithm.medium.reversewordsinastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("blue is sky the",
        solution.reverseWords("the sky is blue"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("blue is sky the",
        solution.reverseWords("  the  sky    is    blue   "));
  }
}
