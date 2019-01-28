package com.leetcode.algorithm.hard.longestsubstringwithatmostkdistinctcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(3, solution.lengthOfLongestSubstringKDistinct("eceba", 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(2, solution.lengthOfLongestSubstringKDistinct("aa", 1));
  }
}
