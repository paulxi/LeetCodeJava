package com.leetcode.algorithm.hard.slidingwindowmaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {3, 3, 5, 5, 6, 7},
        solution.maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3));
  }
}
