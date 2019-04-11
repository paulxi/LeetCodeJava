package com.leetcode.algorithm.hard.substrwithconcatofallwords;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(0, 9), solution.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(), solution.findSubstring("wordgoodgoodgoodbestword", new String[] {"word","good","best","word"}));
  }
}
