package com.leetcode.algorithm.hard.slidingwindowmedian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new double[] {1, -1, -1, 3, 5, 6},
        solution.medianSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new double[] {-2147483648.0,-2147483648.0,-2147483648.0,-2147483648.0,-2147483648.0,2147483647.0,2147483647.0,2147483647.0,2147483647.0,2147483647.0,-2147483648.0},
        solution.medianSlidingWindow(new int[] {-2147483648,-2147483648,2147483647,-2147483648,-2147483648,-2147483648,2147483647,2147483647,2147483647,2147483647,-2147483648,2147483647,-2147483648}, 3));
  }
}