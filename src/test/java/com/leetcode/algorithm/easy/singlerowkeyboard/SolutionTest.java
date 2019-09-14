package com.leetcode.algorithm.easy.singlerowkeyboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(73, solution.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
  }
}
