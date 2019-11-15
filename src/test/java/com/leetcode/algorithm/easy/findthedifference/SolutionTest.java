package com.leetcode.algorithm.easy.findthedifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals('e', solution.findTheDifference("abcd", "abcde"));
  }
}
