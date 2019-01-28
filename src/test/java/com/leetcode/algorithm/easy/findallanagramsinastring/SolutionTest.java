package com.leetcode.algorithm.easy.findallanagramsinastring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(0, 6), solution.findAnagrams("cbaebabacd", "abc"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(0, 1, 2), solution.findAnagrams("abab", "ab"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(), solution.findAnagrams("acb", "ab"));
  }
}
