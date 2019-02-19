package com.leetcode.algorithm.hard.interleavingstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
  }
}
