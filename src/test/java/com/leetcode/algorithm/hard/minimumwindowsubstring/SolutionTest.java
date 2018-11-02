package com.leetcode.algorithm.hard.minimumwindowsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals("aa", solution.minWindow("aa", "aa"));
  }
}
