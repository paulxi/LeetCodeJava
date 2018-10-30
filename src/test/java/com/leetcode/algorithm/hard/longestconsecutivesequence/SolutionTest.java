package com.leetcode.algorithm.hard.longestconsecutivesequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(4, solution.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
  }
}
