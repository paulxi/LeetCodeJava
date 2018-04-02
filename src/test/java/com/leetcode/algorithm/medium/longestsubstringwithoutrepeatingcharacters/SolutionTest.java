package com.leetcode.algorithm.medium.longestsubstringwithoutrepeatingcharacters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testLengthOfLongestSubstringCase1() {
    Solution solution = new Solution();
    assertEquals(0, solution.lengthOfLongestSubstring(""));
  }

  @Test
  public void testLengthOfLongestSubstringCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
  }

  @Test
  public void testLengthOfLongestSubstringCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
  }

  @Test
  public void testLengthOfLongestSubstringCase4() {
    Solution solution = new Solution();
    assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
  }
}
