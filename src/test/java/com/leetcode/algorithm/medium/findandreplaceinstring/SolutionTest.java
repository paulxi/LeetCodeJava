package com.leetcode.algorithm.medium.findandreplaceinstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("eeebffff", solution.findReplaceString("abcd",
        new int[]{0,2}, new String[]{"a","cd"}, new String[]{"eee","ffff"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("eeecd", solution.findReplaceString("abcd",
        new int[]{0,2}, new String[]{"ab","ec"}, new String[]{"eee","ffff"}));
  }
}
