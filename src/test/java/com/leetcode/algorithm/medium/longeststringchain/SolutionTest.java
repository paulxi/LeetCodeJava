package com.leetcode.algorithm.medium.longeststringchain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.longestStrChain(new String[] {"a","b","ba","bca","bda","bdca"}));
  }
}
