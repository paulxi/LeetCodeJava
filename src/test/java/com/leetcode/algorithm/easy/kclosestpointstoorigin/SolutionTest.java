package com.leetcode.algorithm.easy.kclosestpointstoorigin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[][] {{-2, 2}}, solution.kClosest(new int[][] {
        {1, 3}, {-2, 2}
    }, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[][] {{3, 3}, {-2, 4}}, solution.kClosest(new int[][] {
        {3, 3}, {5, -1}, {-2, 4}
    }, 2));
  }
}
