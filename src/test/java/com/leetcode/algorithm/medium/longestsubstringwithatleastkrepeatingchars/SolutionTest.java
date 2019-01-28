package com.leetcode.algorithm.medium.longestsubstringwithatleastkrepeatingchars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.longestSubstring("aaabb", 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(5, solution.longestSubstring("ababbc", 2));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestSubstring("ababacb", 3));
  }
}
