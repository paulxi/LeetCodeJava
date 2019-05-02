package com.leetcode.algorithm.medium.expressivewords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.expressiveWords("heeellooo", new String[] {"hello", "hi", "helo"}));
  }
}
