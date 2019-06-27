package com.leetcode.algorithm.hard.distinctsubsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.numDistinct("rabbbit", "rabbit"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(5, solution.numDistinct("babgbag", "bag"));
  }
}
