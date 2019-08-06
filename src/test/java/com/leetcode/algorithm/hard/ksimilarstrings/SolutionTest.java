package com.leetcode.algorithm.hard.ksimilarstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.kSimilarity("ab", "ba"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.kSimilarity("abc", "bca"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(2, solution.kSimilarity("abac", "baca"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(2, solution.kSimilarity("aabc", "abca"));
  }
}
