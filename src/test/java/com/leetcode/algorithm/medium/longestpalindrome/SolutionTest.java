package com.leetcode.algorithm.medium.longestpalindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testLengthOfLongestPalindromeEmptyString() {
    Solution solution = new Solution();
    assertEquals("", solution.longestPalindrome(""));
  }

  @Test
  public void testLengthOfLongestPalindromeSingleCharString() {
    Solution solution = new Solution();
    assertEquals("a", solution.longestPalindrome("a"));
  }

  @Test
  public void testLengthOfLongestPalindromeOddLengthString() {
    Solution solution = new Solution();
    assertEquals("bab", solution.longestPalindrome("babad"));
  }

  @Test
  public void testLengthOfLongestPalindromeEvenLengthString() {
    Solution solution = new Solution();
    assertEquals("bb", solution.longestPalindrome("cbbd"));
  }
}
