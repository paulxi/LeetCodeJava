package com.leetcode.algorithm.hard.maxchunkstomakesortedii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.maxChunksToSorted(new int[] {5,4,3,2,1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(4, solution.maxChunksToSorted(new int[] {2,1,3,4,4}));
  }
}
