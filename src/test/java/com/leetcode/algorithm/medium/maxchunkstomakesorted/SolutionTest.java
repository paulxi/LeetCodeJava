package com.leetcode.algorithm.medium.maxchunkstomakesorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.maxChunksToSorted(new int[] {4, 3, 2, 1, 0}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(4, solution.maxChunksToSorted(new int[] {1, 0, 2, 3, 4}));
  }
}
