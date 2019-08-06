package com.leetcode.algorithm.hard.poorpigs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.poorPigs(1000, 15, 60));
  }
}
