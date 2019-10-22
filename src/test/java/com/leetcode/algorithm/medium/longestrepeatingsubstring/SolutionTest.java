package com.leetcode.algorithm.medium.longestrepeatingsubstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(0, solution.longestRepeatingSubstring("abcd"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.longestRepeatingSubstring("abbaba"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(3, solution.longestRepeatingSubstring("aabcaabdaab"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(4, solution.longestRepeatingSubstring("aaaaa"));
  }
}
