package com.leetcode.algorithm.hard.minimumwindowsubsequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("bcde", solution.minWindow("abcdebdde", "bde"));
  }
}
