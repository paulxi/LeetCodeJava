package com.leetcode.algorithm.easy.longestcommonprefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("fl", solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("", solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
  }
}
