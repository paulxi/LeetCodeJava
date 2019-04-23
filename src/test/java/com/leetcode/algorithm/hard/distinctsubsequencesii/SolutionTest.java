package com.leetcode.algorithm.hard.distinctsubsequencesii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(7, solution.distinctSubseqII("abc"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(6, solution.distinctSubseqII("aba"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(3, solution.distinctSubseqII("aaa"));
  }
}
