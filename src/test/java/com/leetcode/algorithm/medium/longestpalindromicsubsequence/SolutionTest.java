package com.leetcode.algorithm.medium.longestpalindromicsubsequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testLengthOfLongestPalindromeEmptyString() {
    Solution solution = new Solution();
    assertEquals(4, solution.longestPalindromeSubseq("bbbab"));
  }

  @Test
  public void testLengthOfLongestPalindromeSingleCharString() {
    Solution solution = new Solution();
    assertEquals(2, solution.longestPalindromeSubseq("cbbd"));
  }
}
