package com.leetcode.algorithm.medium.maximumlengthofpairchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.findLongestChain(new int[][] {{1, 2}, {2, 3}, {3, 4}}));
  }
}
