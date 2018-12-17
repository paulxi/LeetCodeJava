package com.leetcode.algorithm.hard.aliendictionary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("wertf", solution.alienOrder(new String[] {"wrt",
        "wrf",
        "er",
        "ett",
        "rftt"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("zx", solution.alienOrder(new String[] {"z", "x"}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("", solution.alienOrder(new String[] {"z", "x", "z"}));
  }
}
