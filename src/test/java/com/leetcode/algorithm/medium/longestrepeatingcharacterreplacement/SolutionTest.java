package com.leetcode.algorithm.medium.longestrepeatingcharacterreplacement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testLengthOfLongestPalindromeEmptyString() {
    Solution solution = new Solution();
    assertEquals(4, solution.characterReplacement("ABAB", 2));
  }

  @Test
  public void testLengthOfLongestPalindromeSingleCharString() {
    Solution solution = new Solution();
    assertEquals(4, solution.characterReplacement("AABABBA", 1));
  }
}
