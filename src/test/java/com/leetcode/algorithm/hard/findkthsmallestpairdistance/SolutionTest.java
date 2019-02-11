package com.leetcode.algorithm.hard.findkthsmallestpairdistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(0, solution.smallestDistancePair(new int[] {1, 3, 1}, 1));
  }
}
